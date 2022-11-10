organization := "org.scalablytyped"
name := "matrix-appservice-bridge"
version := "6.0.0-ef695a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "axios" % "1.1.3-c64e16",
  "org.scalablytyped" %%% "chalk" % "5.1.2-e08eec",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a7050d",
  "org.scalablytyped" %%% "express-rate-limit" % "6.6.0-04b1e4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-2c076a",
  "org.scalablytyped" %%% "logform" % "2.4.2-3da3c1",
  "org.scalablytyped" %%% "matrix-appservice" % "1.1.0-af8b37",
  "org.scalablytyped" %%% "matrix-bot-sdk" % "0.6.2-1f841f",
  "org.scalablytyped" %%% "matrix-org__matrix-sdk-crypto-nodejs" % "0.1.0-beta.1-1cec7f",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-e2d669",
  "org.scalablytyped" %%% "nedb" % "1.8-dt-20211202Z-b5023d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "prom-client" % "14.1.0-410b58",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-c05674",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-9d2495",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "winston" % "3.8.2-351d74",
  "org.scalablytyped" %%% "winston-transport" % "4.5.0-4a035e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
