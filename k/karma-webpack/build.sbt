organization := "org.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20180712Z-3c81ff"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-3be82b",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-232ecf",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-202759",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-3f5e62",
  "org.scalablytyped" %%% "flatted" % "2.0.0-dc5f4b",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-076c64",
  "org.scalablytyped" %%% "log4js" % "4.0.1-f52e97",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180214Z-48de0b",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-a6c585",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1d8315",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-1d4d44",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-280313",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-eb1462",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-c1ecbc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        