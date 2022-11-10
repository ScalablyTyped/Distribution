organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.16.2-b93ebd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-2d7210",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-40a45d",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-96f112",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-eb6512",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-c9c9d6",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-b5f8f1",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-0e670d",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-d3f673",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-063826",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-e90b6c",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-7ef869",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-671cab",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-e4655d",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-bb6ea8",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-ecb27f",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-6fb86c",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-5e042a",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-9e3166",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-8950ae",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-9aadb7",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-5f1d6c",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-8f3d61",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
