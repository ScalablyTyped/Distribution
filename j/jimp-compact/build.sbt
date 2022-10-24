organization := "org.scalablytyped"
name := "jimp-compact"
version := "0.16.1-2-a047a1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__bmp" % "0.16.2-2e6945",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-fe947b",
  "org.scalablytyped" %%% "jimp__gif" % "0.16.2-8ee950",
  "org.scalablytyped" %%% "jimp__jpeg" % "0.16.2-940263",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-d55e45",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-423614",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-8c725a",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-25185b",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-e1bc96",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-402585",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-83e50e",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-23fece",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-af420d",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-dc67e7",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-aa5572",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-4bf52d",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-235501",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-96394d",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-5adf6a",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-6e6c5b",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-855561",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-c6e992",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-3093e2",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-2800c1",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-667192",
  "org.scalablytyped" %%% "jimp__plugins" % "0.16.2-2b6194",
  "org.scalablytyped" %%% "jimp__png" % "0.16.2-768f43",
  "org.scalablytyped" %%% "jimp__tiff" % "0.16.2-ad6610",
  "org.scalablytyped" %%% "jimp__types" % "0.16.2-846433",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
