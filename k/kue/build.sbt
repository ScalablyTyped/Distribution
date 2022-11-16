organization := "org.scalablytyped"
name := "kue"
version := "0.11.x-dt-20220818Z-e5c7d4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-2966c9",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5cc384",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-92c569",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-4d0efa",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-fa36ba",
  "org.scalablytyped" %%% "redis" % "4.5.0-b4316d",
  "org.scalablytyped" %%% "redis__client" % "1.4.0-65a05a",
  "org.scalablytyped" %%% "redis__graph" % "1.1.0-0e08d1",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-92956d",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.4-e918b1",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-088887",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
