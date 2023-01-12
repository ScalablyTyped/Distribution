organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.2-e6e859"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-9bf1f3",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-8f0afc",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-20d8c1",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-38c8c2",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-0371d5",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-4fd5d1",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
