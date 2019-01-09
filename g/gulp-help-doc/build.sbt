organization := "org.scalablytyped"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20180214Z-4440ef"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-cdc05c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-342f5f",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-308d74",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-f607cc",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-82b5dc",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180217Z-347f15",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-e765ef",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-eab0d7",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-e01f0a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        