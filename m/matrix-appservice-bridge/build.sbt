organization := "org.scalablytyped"
name := "matrix-appservice-bridge"
version := "6.0.0-15bdae"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "axios" % "1.1.3-e4dd04",
  "org.scalablytyped" %%% "chalk" % "5.1.2-70b91c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a77eec",
  "org.scalablytyped" %%% "express-rate-limit" % "6.6.0-3d6611",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-80f63d",
  "org.scalablytyped" %%% "logform" % "2.4.2-2366c7",
  "org.scalablytyped" %%% "matrix-appservice" % "1.1.0-74bccc",
  "org.scalablytyped" %%% "matrix-bot-sdk" % "0.6.2-722229",
  "org.scalablytyped" %%% "matrix-org__matrix-sdk-crypto-nodejs" % "0.1.0-beta.1-c52c4a",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "nedb" % "1.8-dt-20211202Z-94ab49",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-07d7e9",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5b9e43",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "winston" % "3.8.2-ca81e6",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-4de3a6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
