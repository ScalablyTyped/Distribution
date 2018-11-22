organization := "com.scalablytyped"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20180910Z-a66b1c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-347dbd",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-cc6273",
  "com.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-00e858",
  "com.scalablytyped" %%% "gulp" % "4.0-dt-20180910Z-8d242f",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-5a910f",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "undertaker" % "1.2-dt-20180910Z-b1ca0a",
  "com.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180910Z-215b0e",
  "com.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-e8fbb3",
  "com.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-80ea7b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        