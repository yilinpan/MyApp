package com.example.a.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mBtnButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnButton2 = findViewById(R.id.button2);
        mBtnButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,PictureActivity.class);
                startActivity(intent);
            }
        });

    }
    public void showToast(View view){
        Toast.makeText(this, "没想好显示啥", Toast.LENGTH_SHORT).show();
    }
}
