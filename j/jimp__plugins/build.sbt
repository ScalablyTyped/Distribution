organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.8.5-be1110"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-6ebdb6",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.8.5-e78ece",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.8.5-7c783b",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.8.5-0c4d27",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.8.5-aa58e2",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.8.5-80b8a3",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.8.5-028374",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.8.5-f4eb1d",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.8.5-d674ba",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.8.5-8759ca",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.8.5-c271ea",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.8.5-8ac7f4",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.8.5-d6ba59",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.8.5-a85c84",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.8.5-858e1e",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.8.5-ce3c79",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.8.5-84d2f4",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.8.5-d20ecb",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        