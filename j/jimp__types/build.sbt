organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.2-4e8aaf"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-0f0397",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-9e8235",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-19b563",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-123599",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-fbcdf0",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-afbbe2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
