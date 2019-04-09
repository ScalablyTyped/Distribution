organization := "org.scalablytyped"
name := "ionic__utils-subprocess"
version := "0.1.0-1cf039"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cross-spawn" % "6.0-dt-20190228Z-89cc98",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-6d3a60",
  "org.scalablytyped" %%% "ionic__utils-array" % "0.0.1-d2e142",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.2.0-434f23",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-a4bb6f",
  "org.scalablytyped" %%% "ionic__utils-process" % "0.1.0-6b6a11",
  "org.scalablytyped" %%% "ionic__utils-stream" % "0.0.1-4056e5",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "0.0.1-afccfe",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-189997",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-26977f",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        