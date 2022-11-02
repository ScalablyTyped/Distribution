organization := "org.scalablytyped"
name := "kue"
version := "0.11.x-dt-20220818Z-1ae4e8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-944d8b",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-0c6b73",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-0d7941",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "redis" % "4.4.0-5f6f08",
  "org.scalablytyped" %%% "redis__client" % "1.3.1-37247e",
  "org.scalablytyped" %%% "redis__graph" % "1.1.0-ecfaa6",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-5e373c",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.3-2a9bc2",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-3b575f",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
