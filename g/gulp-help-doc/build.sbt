organization := "com.scalablytyped"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20181102Z-cbf3db"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "chokidar" % "1.7-dt-20181102Z-1e4973",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20181102Z-ea59e6",
  "com.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20181102Z-c32f79",
  "com.scalablytyped" %%% "gulp" % "4.0-dt-20181102Z-ce40b0",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20181102Z-8447c6",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "undertaker" % "1.2-dt-20181102Z-ea5b43",
  "com.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20181102Z-1d67a6",
  "com.scalablytyped" %%% "vinyl" % "2.0-dt-20181102Z-9ddac1",
  "com.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181102Z-59b873",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        