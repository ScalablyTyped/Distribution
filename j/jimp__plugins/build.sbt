organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.16.1-a6a187"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__core" % "0.16.1-ae00c9",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.1-525be9",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.1-4c9082",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.1-cb0a66",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.1-9d52c9",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.1-393165",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.1-5192f4",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.1-64acf3",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.1-bdf9e7",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.1-e00f2c",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.1-8dfa57",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.1-41dcb8",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.1-9e8467",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.1-f3ff6d",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.1-b18947",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.1-c84d1f",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.1-edce8c",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.1-e23b65",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.1-bfae92",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.1-d8b043",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.1-9cb821",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.1-718ca7",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
