organization := "org.scalablytyped"
name := "matrix-appservice-bridge"
version := "6.0.0-6522ef"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "axios" % "1.1.3-cbfed8",
  "org.scalablytyped" %%% "chalk" % "5.1.2-68fef1",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-d74acb",
  "org.scalablytyped" %%% "express-rate-limit" % "6.6.0-b4d4f1",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-06d29e",
  "org.scalablytyped" %%% "logform" % "2.4.2-8544ea",
  "org.scalablytyped" %%% "matrix-appservice" % "1.1.0-302b8c",
  "org.scalablytyped" %%% "matrix-bot-sdk" % "0.6.2-6b62b6",
  "org.scalablytyped" %%% "matrix-org__matrix-sdk-crypto-nodejs" % "0.1.0-beta.1-f740c9",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "nedb" % "1.8-dt-20211202Z-4d7ed3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-7c4afd",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-696f82",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "winston" % "3.8.2-916fd5",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-74ff67")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
