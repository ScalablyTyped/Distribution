organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-ceb69c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-d949ef",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-00b149",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-7173d5",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-785a8e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-30ca1a",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4d6b96",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-f77d7a",
  "org.scalablytyped" %%% "typescript" % "3.3.1-b7b6b0",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-18e734",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190128Z-787caa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        