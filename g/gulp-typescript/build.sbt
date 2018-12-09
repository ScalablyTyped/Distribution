organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-0874f1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "1.0-dt-20180910Z-8224d1",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-82c87b",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-084074",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-937a94",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180910Z-9006cb",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4f6afc",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-d3b4a6",
  "org.scalablytyped" %%% "typescript" % "3.2.2-fe9cc4",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-520850",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-4efe7c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        