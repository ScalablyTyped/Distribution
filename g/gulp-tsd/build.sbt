organization := "com.scalablytyped"
name := "gulp-tsd"
version := "0.0-unknown-dt-20180910Z-d159df"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-4d8c2f",
  "com.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-8a7f1f",
  "com.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-c0de3f",
  "com.scalablytyped" %%% "gulp" % "4.0-dt-20180910Z-8f514a",
  "com.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-5ec0b9",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "undertaker" % "1.2-dt-20180910Z-163fef",
  "com.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180910Z-e28108",
  "com.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-a0b930",
  "com.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-75e812",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        