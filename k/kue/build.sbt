organization := "org.scalablytyped"
name := "kue"
version := "0.11.x-dt-20220818Z-020067"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a7050d",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-2c076a",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-368b85",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-e2d669",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-c05674",
  "org.scalablytyped" %%% "redis" % "4.5.0-74397c",
  "org.scalablytyped" %%% "redis__client" % "1.4.0-f30c1c",
  "org.scalablytyped" %%% "redis__graph" % "1.1.0-926c0b",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-2b4a01",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.4-f7cc12",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-9d2495",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
