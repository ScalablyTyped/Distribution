organization := "org.scalablytyped"
name := "matrix-appservice-bridge"
version := "6.0.0-61770f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "axios" % "1.1.3-e4dd04",
  "org.scalablytyped" %%% "chalk" % "5.1.2-70b91c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cbb6c3",
  "org.scalablytyped" %%% "express-rate-limit" % "6.6.0-b80bc1",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-035d9a",
  "org.scalablytyped" %%% "logform" % "2.4.2-2366c7",
  "org.scalablytyped" %%% "matrix-appservice" % "1.1.0-06e961",
  "org.scalablytyped" %%% "matrix-bot-sdk" % "0.6.2-d8a7e7",
  "org.scalablytyped" %%% "matrix-org__matrix-sdk-crypto-nodejs" % "0.1.0-beta.1-c52c4a",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "nedb" % "1.8-dt-20211202Z-7b2024",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-07d7e9",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-c7a026",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "winston" % "3.8.2-24546a",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-132333")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
