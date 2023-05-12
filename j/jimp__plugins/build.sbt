organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.22.8-ec8d32"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__core" % "0.22.8-1afddc",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.22.8-a44f1b",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.22.8-3ceb96",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.22.8-016ce3",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.22.8-b1fc28",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.22.8-4a76a3",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.22.8-970afa",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.22.8-a2b29e",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.22.8-17c561",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.22.8-df86a6",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.22.8-bfddc5",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.22.8-aab2ac",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.22.8-60d8d5",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.22.8-da5fff",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.22.8-f7ceaf",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.22.8-104372",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.22.8-196950",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.22.8-0a8be1",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.22.8-5e4c96",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.22.8-ac6fea",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.22.8-58f342",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.22.8-c3d174",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
