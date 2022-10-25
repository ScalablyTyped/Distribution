organization := "org.scalablytyped"
name := "jimp-compact"
version := "0.16.1-2-d4898a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-6f3eaf",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-6f1a8f",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-e3d1b6",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-f52180",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-e4359b",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-357a44",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-4b57c1",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-ef33ef",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-46a197",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-7e47e2",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-a35d31",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-f66ebf",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-1b23ab",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-8c80a0",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-3169b3",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-689b26",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-33c265",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-fb0d5c",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-43baf1",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-23d9b9",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-610550",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-d87345",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-12501f",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-ed85ef",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-0b8011",
  "org.scalablytyped" %%% "jimp__plugins" % "0.16.2-e9298c",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-bfc959",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-cd341f",
  "org.scalablytyped" %%% "jimp__types" % "0.16.2-4fd8fb",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
