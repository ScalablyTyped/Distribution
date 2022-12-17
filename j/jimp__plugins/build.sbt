organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.16.2-9d7cf9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-38c244",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-a3295f",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-6f289a",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-9a4387",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-2df6f4",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-eebd40",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-24758b",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-0cf214",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-76df3f",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-d0c26e",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-8af372",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-bdeef7",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-f917df",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-ba84db",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-b53e9e",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-20468e",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-797e88",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-c0e1f5",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-e681ea",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-a7c0b6",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-a7ea4f",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-a1bf39",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
