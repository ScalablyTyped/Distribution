organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-92136e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "3.2-dt-20181231Z-8a50d0",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-342f5f",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-308d74",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-82b5dc",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180214Z-643074",
  "org.scalablytyped" %%% "source-map" % "0.7.3-8fe344",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-a99e85",
  "org.scalablytyped" %%% "typescript" % "3.2.2-12aee5",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-eab0d7",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-e01f0a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        