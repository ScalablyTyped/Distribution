organization := "org.scalablytyped"
name := "koa-joi-router"
version := "8.0-dt-20220106Z-e054d6"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-8d6d0a",
  "org.scalablytyped" %%% "busboy" % "1.5-dt-20220624Z-c1f761",
  "org.scalablytyped" %%% "co-body" % "6.1-dt-20211202Z-534873",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-ff93c1",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-3b4e14",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-cb149c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-6f01fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-c34bb1",
  "org.scalablytyped" %%% "joi" % "17.6.0-f7916a",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-62b434",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-d738e8",
  "org.scalablytyped" %%% "koa-router" % "7.4-dt-20211202Z-286a9d",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-21c0d6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-11838a",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-77d826",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
