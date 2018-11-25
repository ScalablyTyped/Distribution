organization := "com.scalablytyped"
name := "gulp-help"
version := "0.0-unknown-dt-20180910Z-a461f1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-2012d1",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-5d44f9",
  "com.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-3cb6f6",
  "com.scalablytyped" %%% "gulp" % "4.0-dt-20180910Z-e39e0e",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-298c87",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "orchestrator" % "0.3-dt-20180910Z-d91ea6",
  "com.scalablytyped" %%% "q" % "1.5-dt-20180915Z-f3431e",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "undertaker" % "1.2-dt-20180910Z-80a47c",
  "com.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180910Z-215b0e",
  "com.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-01cac1",
  "com.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-1eadae",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        