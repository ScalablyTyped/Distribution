organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.9.8-b2b57b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.9.8-b0b5e6",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.9.8-a8ef04",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.9.8-f00fdf",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.9.8-de1c67",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.9.8-526e3e",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.9.8-6a1c37",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.9.8-f632fa",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.9.8-875a75",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.9.8-f0f8f0",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.9.8-4079bd",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.9.8-13125a",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.9.8-df3ad4",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.9.8-e74a62",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.9.8-e53aa2",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.9.8-49a40c",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.9.8-4d8469",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.9.8-433959",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.9.8-944be9",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.9.8-e5aea5",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.9.8-d9c221",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.9.8-0f9328",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.9.8-8cf354",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
