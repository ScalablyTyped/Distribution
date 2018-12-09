organization := "org.scalablytyped"
name := "gulp-help-doc"
version := "0.0-unknown-dt-20180910Z-fc50ab"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-34f74c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-82c87b",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-084074",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180910Z-8dd1bb",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-937a94",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180910Z-4ee1e4",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180910Z-551814",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-520850",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-4efe7c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        