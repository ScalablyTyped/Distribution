organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.8.5-54e36a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-551d7e",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.8.5-a9c719",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.8.5-9a17e4",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.8.5-975e0a",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.8.5-4a84cd",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.8.5-802738",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.8.5-82cc1a",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.8.5-7ad854",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.8.5-a8fde6",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.8.5-1688a7",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.8.5-357fcc",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.8.5-43a00f",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.8.5-8940bc",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.8.5-87168b",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.8.5-1186fd",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.8.5-a79583",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.8.5-f16bf8",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.8.5-87cfa0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        