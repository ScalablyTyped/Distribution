organization := "com.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20181203Z-3c5378"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-7bd99a",
  "com.scalablytyped" %%% "circular-json" % "0.4-dt-20180910Z-026cdb",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e9dd4f",
  "com.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180910Z-b8ff7c",
  "com.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-5bf12f",
  "com.scalablytyped" %%% "log4js" % "3.0.6-9c892f",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        