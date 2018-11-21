organization := "com.scalablytyped"
name := "karma-coverage"
version := "v0.5.3-dt-20180910Z-cfd7bd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-3124ce",
  "com.scalablytyped" %%% "circular-json" % "0.4-dt-20180910Z-d0d4f0",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-8c87a5",
  "com.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180910Z-dcec4a",
  "com.scalablytyped" %%% "karma" % "3.0-dt-20181004Z-71227a",
  "com.scalablytyped" %%% "log4js" % "3.0.6-50739d",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        