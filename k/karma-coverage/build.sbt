organization := "com.scalablytyped"
name := "karma-coverage"
version := "v0.5.3-dt-20181102Z-79953f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20181102Z-6d07df",
  "com.scalablytyped" %%% "circular-json" % "0.4-dt-20181102Z-558bf7",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181102Z-fdaa94",
  "com.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20181102Z-77123a",
  "com.scalablytyped" %%% "karma" % "3.0-dt-20181102Z-f30efa",
  "com.scalablytyped" %%% "log4js" % "3.0.6-fa3eab",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        