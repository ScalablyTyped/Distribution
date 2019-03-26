organization := "org.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20190212Z-3c6a45"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-63350e",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-d754c7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-c85ddc",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-e59bbf",
  "org.scalablytyped" %%% "flatted" % "2.0.0-1e1bed",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20190212Z-7d3e1e",
  "org.scalablytyped" %%% "log4js" % "4.1.0-770fa1",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-c04625",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-31a2a5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "source-map" % "0.7.3-aac742",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-c2e5ed",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-5fcf02",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190316Z-1cc7c8",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-82e824")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        