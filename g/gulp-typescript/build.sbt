organization := "org.scalablytyped"
name := "gulp-typescript"
version := "5.0.0-a178a6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-colors" % "1.0-dt-20180910Z-703d8f",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-63ba70",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-6b61f8",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-4563df",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "plugin-error" % "0.1-dt-20180910Z-71cfe5",
  "org.scalablytyped" %%% "source-map" % "0.7.3-faaeaa",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-f36a40",
  "org.scalablytyped" %%% "typescript" % "3.2.1-a03537",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-a9e0db",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-2c40dc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        