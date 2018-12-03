organization := "com.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20180910Z-f863de"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-d67b41",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-b89aff",
  "com.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-5e4154",
  "com.scalablytyped" %%% "gulp" % "4.0-dt-20180910Z-27b735",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-5ec0b9",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "orchestrator" % "0.3-dt-20180910Z-0342fb",
  "com.scalablytyped" %%% "q" % "1.5-dt-20180915Z-726082",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "undertaker" % "1.2-dt-20180910Z-480d34",
  "com.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180910Z-e28108",
  "com.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-9c15c8",
  "com.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-ca8b43",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        