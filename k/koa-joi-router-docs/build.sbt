organization := "org.scalablytyped"
name := "koa-joi-router-docs"
version := "1.0-dt-20211202Z-8d2462"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-55ac55",
  "org.scalablytyped" %%% "busboy" % "1.5-dt-20220624Z-84b12a",
  "org.scalablytyped" %%% "co-body" % "6.1-dt-20211202Z-b6406c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-4bfaa3",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-2365b2",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-a5fdea",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-118d16",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-e830b8",
  "org.scalablytyped" %%% "joi" % "17.7.0-c612b4",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-11672a",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-6a6a2c",
  "org.scalablytyped" %%% "koa-joi-router" % "8.0-dt-20220106Z-f547d5",
  "org.scalablytyped" %%% "koa-router" % "7.4-dt-20211202Z-68803b",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-381f52",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-625bd0",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5be9af",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
