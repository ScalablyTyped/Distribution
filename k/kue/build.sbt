organization := "org.scalablytyped"
name := "kue"
version := "0.11.x-dt-20220818Z-869934"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-118d16",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-e830b8",
  "org.scalablytyped" %%% "generic-pool" % "3.9.0-963325",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-381f52",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-625bd0",
  "org.scalablytyped" %%% "redis" % "4.5.0-b4a178",
  "org.scalablytyped" %%% "redis__client" % "1.4.0-764645",
  "org.scalablytyped" %%% "redis__graph" % "1.1.0-57e483",
  "org.scalablytyped" %%% "redis__search" % "1.1.0-a4646e",
  "org.scalablytyped" %%% "redis__time-series" % "1.0.4-1c6ef9",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5be9af",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
