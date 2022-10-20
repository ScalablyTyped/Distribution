organization := "org.scalablytyped"
name := "koa-docs"
version := "2.1-dt-20211202Z-45ff90"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20211202Z-a5b0cd",
  "org.scalablytyped" %%% "busboy" % "1.5-dt-20220624Z-c76ba4",
  "org.scalablytyped" %%% "co-body" % "6.1-dt-20211202Z-7ae1c4",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-a053c4",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20220505Z-3b4e14",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20211202Z-978690",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-318396",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-9fa163",
  "org.scalablytyped" %%% "joi" % "17.6.3-e7f424",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20211202Z-fc3ebd",
  "org.scalablytyped" %%% "koa" % "2.13.1-dt-20220818Z-71db0f",
  "org.scalablytyped" %%% "koa-joi-router" % "8.0-dt-20220106Z-3a7eaf",
  "org.scalablytyped" %%% "koa-router" % "7.4-dt-20211202Z-cbecc6",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-3bb8ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
