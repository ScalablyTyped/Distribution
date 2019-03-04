organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-9d674e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-7ea915",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b3a88d",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-2438ca",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20190212Z-f312f2",
  "org.scalablytyped" %%% "source-map" % "0.7.3-39089e",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-2d5355",
  "org.scalablytyped" %%% "typescript" % "3.3.3333-4b18ce",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-7c3560",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-e3f175")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        