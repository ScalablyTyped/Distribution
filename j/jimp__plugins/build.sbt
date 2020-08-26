organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.14.0-3ab926"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.14.0-eb0cd3",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.14.0-aed5a8",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.14.0-00f166",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.14.0-c8d7e6",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.14.0-9cee3a",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.14.0-b1eba5",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.14.0-e578de",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.14.0-8c6eb9",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.14.0-28f84d",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.14.0-1ee60c",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.14.0-c7ea3a",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.14.0-607c23",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.14.0-ceb415",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.14.0-f9c958",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.14.0-c188c1",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.14.0-1f7338",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.14.0-0790ae",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.14.0-964d37",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.14.0-2fb2d0",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.14.0-acd9dd",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.14.0-ae796f",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.14.0-630906",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
