organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.8.5-fdd740"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-0f655b",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.8.5-581433",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.8.5-512172",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.8.5-acfe92",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.8.5-f44232",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.8.5-daa4b8",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.8.5-2de34a",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.8.5-1c2b5f",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.8.5-4cfa0c",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.8.5-0091ec",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.8.5-c7af09",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.8.5-f883f0",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.8.5-95c616",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.8.5-c265ee",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.8.5-12a459",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.8.5-362e44",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.8.5-b97c70",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.8.5-b58075",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        