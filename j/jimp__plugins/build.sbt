organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.22.8-4b0fff"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__core" % "0.22.8-c119c1",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.22.8-3d2012",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.22.8-165eca",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.22.8-d79f6f",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.22.8-4700b2",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.22.8-2722e6",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.22.8-e3d242",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.22.8-3a9388",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.22.8-953e3a",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.22.8-c76aaf",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.22.8-e91fd1",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.22.8-7a5e2b",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.22.8-7a9f9e",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.22.8-605add",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.22.8-cd9a52",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.22.8-77d947",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.22.8-44c1fe",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.22.8-8cf400",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.22.8-0dda15",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.22.8-60880e",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.22.8-70993e",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.22.8-bca413",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
