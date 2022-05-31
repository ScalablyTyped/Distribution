organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.1-aeac34"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.1-dabe40",
  "org.scalablytyped" %%% "jimp__core" % "0.16.1-7dc26f",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.1-fa0cae",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.1-0d9408",
  "org.scalablytyped" %%% "jimp__png" % "0.16.1-f037fa",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.1-18b2ae",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
