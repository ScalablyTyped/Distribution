organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20181203Z-7a6a0e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-865309",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "flatted" % "2.0.0-a147dd",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20180312Z-67d6fa",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20190212Z-2e9f48",
  "org.scalablytyped" %%% "log4js" % "4.0.2-c9df6a",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        