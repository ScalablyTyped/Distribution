organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.16.2-a3631e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-8f0afc",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-f37c6b",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-73c546",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-26d87d",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-c5287d",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-edc764",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-04c04e",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-2c0240",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-7f8c30",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-f238a0",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-53262e",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-e4673f",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-b5e5df",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-b81f35",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-31025e",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-de9239",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-6059cf",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-462ee8",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-e6348e",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-fc8d31",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-65edf0",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-d9b624",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
