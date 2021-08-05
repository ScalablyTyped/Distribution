organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.16.1-9ab946"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__core" % "0.16.1-ed88dd",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.1-bc1b8a",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.1-1bd27b",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.1-bc32b3",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.1-2fcdcf",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.1-9f4d8c",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.1-dafed4",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.1-69f909",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.1-b0ab54",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.1-f9d86b",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.1-7b448e",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.1-a298d9",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.1-5ddbd1",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.1-a43765",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.1-26c253",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.1-6bdbec",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.1-a95a62",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.1-fd4c2a",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.1-e02f88",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.1-215222",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.1-6a0abc",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.1-3d50a2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
