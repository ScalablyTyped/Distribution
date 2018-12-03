organization := "com.scalablytyped"
name := "ionic__utils-fs"
version := "0.0.5-9ba74c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e9dd4f",
  "com.scalablytyped" %%% "ncp" % "v2.0.0-dt-20180910Z-66204e",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-d07fd4",
  "com.scalablytyped" %%% "tslib" % "1.9.3-9baf35",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        