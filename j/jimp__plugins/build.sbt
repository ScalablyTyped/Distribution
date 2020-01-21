organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.8.5-24adcb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-165e60",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.8.5-23b094",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.8.5-cc6962",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.8.5-bf5a56",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.8.5-337c4a",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.8.5-0909c4",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.8.5-e8df9a",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.8.5-b00866",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.8.5-527e40",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.8.5-992ec8",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.8.5-e7ed45",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.8.5-a0e8d0",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.8.5-ffc318",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.8.5-7aa191",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.8.5-d8298b",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.8.5-34a45f",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.8.5-40e69a",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.8.5-9d0dc1",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        