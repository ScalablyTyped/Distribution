organization := "org.scalablytyped"
name := "kue"
version := "0.11.x-dt-20220818Z-5c692c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cb1e35",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5f1c10",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-0d26e8",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-85c9dc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-137229",
  "org.scalablytyped" %%% "redis" % "4.5.0-499ae5",
  "org.scalablytyped" %%% "redis__client" % "1.4.0-c6da96",
  "org.scalablytyped" %%% "redis__graph" % "1.1.0-c71a28",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-ec7d59",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.4-0f1a93",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-d3379f",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
