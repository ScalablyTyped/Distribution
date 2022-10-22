organization := "org.scalablytyped"
name := "jimp__types"
version := "0.16.2-2bfd7c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-bf7f41",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-65a7e2",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-ac2382",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-d9ae35",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-cc60dd",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-5e9962",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
