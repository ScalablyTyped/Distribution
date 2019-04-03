organization := "org.scalablytyped"
name := "ionic__utils-subprocess"
version := "0.1.0-b90a67"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cross-spawn" % "6.0-dt-20190228Z-4593ac",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-a8786c",
  "org.scalablytyped" %%% "ionic__utils-array" % "0.0.1-d2e142",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.2.0-a89099",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-a4bb6f",
  "org.scalablytyped" %%% "ionic__utils-process" % "0.1.0-753fa0",
  "org.scalablytyped" %%% "ionic__utils-stream" % "0.0.1-8e2f8a",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "0.0.1-afccfe",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-d326d3",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-26977f",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        