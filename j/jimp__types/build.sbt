organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.1-fb6c83"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.1-061cbd",
  "org.scalablytyped" %%% "jimp__core" % "0.16.1-ae00c9",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.1-6374b6",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.1-ad031e",
  "org.scalablytyped" %%% "jimp__png" % "0.16.1-1eda79",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.1-54f1d3",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
