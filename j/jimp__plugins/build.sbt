organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.8.5-ac3517"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-b7acfa",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.8.5-b1d04a",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.8.5-07764a",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.8.5-edd416",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.8.5-71761d",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.8.5-228ada",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.8.5-7e52a1",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.8.5-a7ad26",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.8.5-b6e319",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.8.5-f18816",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.8.5-c5cb51",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.8.5-32e942",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.8.5-fc6a53",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.8.5-9ee1b1",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.8.5-d2a8d6",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.8.5-8872f5",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.8.5-3ce01c",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.8.5-83754c",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        