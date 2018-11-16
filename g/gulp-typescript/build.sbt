organization := "com.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-alpha.3-cc4cc6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-colors" % "1.0-dt-20181102Z-ba8738",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20181102Z-ea59e6",
  "com.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20181102Z-c32f79",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20181102Z-8447c6",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "plugin-error" % "0.1-dt-20181102Z-9df827",
  "com.scalablytyped" %%% "source-map" % "0.7.3-771552",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "through2" % "2.0-dt-20181102Z-a2eea1",
  "com.scalablytyped" %%% "typescript" % "3.1.6-0ff591",
  "com.scalablytyped" %%% "vinyl" % "2.0-dt-20181102Z-9ddac1",
  "com.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181102Z-59b873",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        