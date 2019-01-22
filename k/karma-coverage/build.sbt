organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20181203Z-90c782"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-232ecf",
  "org.scalablytyped" %%% "circular-json" % "0.4-dt-20180214Z-23dde6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-3f5e62",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180312Z-88ed38",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-47cad8",
  "org.scalablytyped" %%% "log4js" % "3.0.6-d266a8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        