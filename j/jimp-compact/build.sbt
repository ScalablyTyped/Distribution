organization := "org.scalablytyped"
name := "jimp-compact"
version := "0.16.1-2-0bee98"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-21d219",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-8d6812",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-9c8fdb",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-58e664",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-677d7b",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-88aee8",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-3b5fb5",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-a88e61",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-6c575d",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-b7ca52",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-a4788d",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-b3da6f",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-329a81",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-7bdf37",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-7d4f2d",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-f082ee",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-d9fe4e",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-a5118a",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-c9342f",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-d41373",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-28a081",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-0c4c8b",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-6fb893",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-0bbe6d",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-3334e0",
  "org.scalablytyped" %%% "jimp__plugins" % "0.16.2-e817b7",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-ab66cd",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-a82423",
  "org.scalablytyped" %%% "jimp__types" % "0.16.2-cd3b7a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
