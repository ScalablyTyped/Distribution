organization := "org.scalablytyped"
name := "jimp__plugins"
version := "0.16.2-49952e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jimp__core" % "0.16.2-6ca6c4",
  "org.scalablytyped" %%% "jimp__plugin-blit" % "0.16.2-1e2902",
  "org.scalablytyped" %%% "jimp__plugin-blur" % "0.16.2-5b3892",
  "org.scalablytyped" %%% "jimp__plugin-circle" % "0.16.2-532d25",
  "org.scalablytyped" %%% "jimp__plugin-color" % "0.16.2-d2a8b8",
  "org.scalablytyped" %%% "jimp__plugin-contain" % "0.16.2-c615fb",
  "org.scalablytyped" %%% "jimp__plugin-cover" % "0.16.2-e34a5f",
  "org.scalablytyped" %%% "jimp__plugin-crop" % "0.16.2-b9558e",
  "org.scalablytyped" %%% "jimp__plugin-displace" % "0.16.2-e8eea4",
  "org.scalablytyped" %%% "jimp__plugin-dither" % "0.16.2-2b8a3c",
  "org.scalablytyped" %%% "jimp__plugin-fisheye" % "0.16.2-becb82",
  "org.scalablytyped" %%% "jimp__plugin-flip" % "0.16.2-7282c1",
  "org.scalablytyped" %%% "jimp__plugin-gaussian" % "0.16.2-711cfa",
  "org.scalablytyped" %%% "jimp__plugin-invert" % "0.16.2-a3b7c9",
  "org.scalablytyped" %%% "jimp__plugin-mask" % "0.16.2-85b68e",
  "org.scalablytyped" %%% "jimp__plugin-normalize" % "0.16.2-edd6d0",
  "org.scalablytyped" %%% "jimp__plugin-print" % "0.16.2-710b91",
  "org.scalablytyped" %%% "jimp__plugin-resize" % "0.16.2-6cb351",
  "org.scalablytyped" %%% "jimp__plugin-rotate" % "0.16.2-640526",
  "org.scalablytyped" %%% "jimp__plugin-scale" % "0.16.2-58038e",
  "org.scalablytyped" %%% "jimp__plugin-shadow" % "0.16.2-dad6de",
  "org.scalablytyped" %%% "jimp__plugin-threshold" % "0.16.2-68031e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
