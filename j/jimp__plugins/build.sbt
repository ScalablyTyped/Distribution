organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.8.5-a6ebb5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jimp__core" % "0.8.5-bbe5c8",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.8.5-ac6917",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.8.5-173325",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.8.5-c7401d",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.8.5-1b13e2",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.8.5-9e9d4a",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.8.5-279f10",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.8.5-41cb29",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.8.5-ce2171",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.8.5-b036bb",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.8.5-0e7a25",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.8.5-b89754",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.8.5-69e8e9",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.8.5-92e02c",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.8.5-c4f578",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.8.5-a925d2",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.8.5-8840f4",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.8.5-888298",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        