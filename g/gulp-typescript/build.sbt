organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-61845c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-9d8abf",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-48cb89",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-372658",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-0cfa58",
  "org.scalablytyped" %%% "source-map" % "0.7.3-cdf339",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-bafec4",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-7959f4",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-2f8725",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190212Z-f83dc6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        