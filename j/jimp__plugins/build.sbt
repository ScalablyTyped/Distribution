organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.16.1-3fb47f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__core" % "0.16.1-7dc26f",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.1-0e35f3",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.1-70ed3b",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.1-9f6f75",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.1-417533",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.1-0dc62c",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.1-80936c",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.1-9d66e6",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.1-f79fb1",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.1-9bfd85",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.1-6364eb",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.1-65d558",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.1-f159aa",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.1-943865",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.1-02013f",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.1-f94b73",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.1-79139f",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.1-2cc02e",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.1-9a41b0",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.1-90afef",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.1-1cf88b",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.1-e71129",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
