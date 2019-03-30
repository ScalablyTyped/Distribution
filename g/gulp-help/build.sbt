organization := "org.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20190322Z-22add2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-6f800f",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-306649",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-51b7e9",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-8bb714",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20190329Z-819655",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-20d03b",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190322Z-6cbc52",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-b8b248",
  "org.scalablytyped" %%% "is-binary-path" % "2.0-dt-20180214Z-900f29",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20190329Z-4226a6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "normalize-path" % "3.0-dt-20181225Z-45086b",
  "org.scalablytyped" %%% "orchestrator" % "0.3-dt-20190322Z-1f5c7e",
  "org.scalablytyped" %%% "path-is-absolute" % "1.0-dt-20180214Z-ae48af",
  "org.scalablytyped" %%% "q" % "1.5-dt-20190313Z-c63ee9",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190212Z-d874a4",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-8c5417",
  "org.scalablytyped" %%% "upath" % "1.1.2-adf450",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-739799",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-c9de9b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        