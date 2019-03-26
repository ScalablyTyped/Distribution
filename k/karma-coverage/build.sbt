organization := "org.scalablytyped"
name := "karma-coverage"
version := "1.1-dt-20190322Z-9a79d4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-d754c7",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-e59bbf",
  "org.scalablytyped" %%% "flatted" % "2.0.0-1e1bed",
  "org.scalablytyped" %%% "istanbul" % "v0.4.0-dt-20190322Z-3adbd6",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20190212Z-7d3e1e",
  "org.scalablytyped" %%% "log4js" % "4.1.0-770fa1",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        