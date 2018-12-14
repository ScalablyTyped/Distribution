organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20181203Z-cc6981"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181214Z-e561d3",
  "org.scalablytyped" %%% "circular-json" % "0.4-dt-20180910Z-142721",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-c10888",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180910Z-931d8f",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-28e609",
  "org.scalablytyped" %%% "log4js" % "3.0.6-ab1e70",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        