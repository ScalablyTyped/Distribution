organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.16.2-c3cec0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-9e8235",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-7a9cd6",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-3147ba",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-eac3ed",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-5bf9c7",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-3221c3",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-e4e267",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-3439be",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-274984",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-1fede4",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-2c2f82",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-ccfd0f",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-57cbda",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-dce849",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-c6252b",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-5435a7",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-6952c2",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-442a18",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-9b2da3",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-b88f64",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-52d213",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-09f7ae",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
