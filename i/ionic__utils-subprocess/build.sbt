organization := "org.scalablytyped"
name := "ionic__utils-subprocess"
version := "0.1.0-b330ca"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cross-spawn" % "6.0-dt-20190228Z-a57b9f",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-811058",
  "org.scalablytyped" %%% "ionic__utils-array" % "0.0.1-fdd8d0",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.2.0-689950",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-dd72d4",
  "org.scalablytyped" %%% "ionic__utils-process" % "0.1.0-d3245b",
  "org.scalablytyped" %%% "ionic__utils-stream" % "0.0.1-7e8124",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "0.0.1-2d4966",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190227Z-56553a",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-989c27",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-e32c2a",
  "org.scalablytyped" %%% "tslib" % "1.9.3-d28c21")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        