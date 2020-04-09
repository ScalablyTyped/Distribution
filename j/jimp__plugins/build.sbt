organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.9.8-ef998c"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.9.8-c675ff",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.9.8-468896",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.9.8-c6e2ef",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.9.8-79ee02",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.9.8-c57bde",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.9.8-ba273b",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.9.8-a0da9e",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.9.8-26ce74",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.9.8-d8f7dd",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.9.8-09bc7b",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.9.8-23ca77",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.9.8-4bb3d1",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.9.8-93c12d",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.9.8-cbf92d",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.9.8-c3e3f1",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.9.8-604eda",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.9.8-5f0a66",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.9.8-b2520a",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.9.8-8ddf6f",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.9.8-d04dfe",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.9.8-62cce6",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.9.8-cc90f8",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
