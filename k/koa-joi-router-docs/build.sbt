organization := "org.scalablytyped"
name := "koa-joi-router-docs"
version := "1.0-dt-20211202Z-a04c21"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-ea3ef3",
  "org.scalablytyped" %%% "busboy" % "1.5-dt-20220624Z-10df9a",
  "org.scalablytyped" %%% "co-body" % "6.1-dt-20211202Z-fc8ecb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-c317a9",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-baf750",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-a5f7f1",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a7050d",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-2c076a",
  "org.scalablytyped" %%% "joi" % "17.7.0-d79f84",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-548241",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-a0340d",
  "org.scalablytyped" %%% "koa-joi-router" % "8.0-dt-20220106Z-47bc46",
  "org.scalablytyped" %%% "koa-router" % "7.4-dt-20211202Z-c9ce2b",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-e2d669",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-c05674",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-9d2495",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
