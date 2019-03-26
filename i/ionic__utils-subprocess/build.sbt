organization := "org.scalablytyped"
name := "ionic__utils-subprocess"
version := "0.1.0-87794a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cross-spawn" % "6.0-dt-20190228Z-59b06d",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-e59bbf",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-6662de",
  "org.scalablytyped" %%% "ionic__utils-array" % "0.0.1-92ef19",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.2.0-43ceac",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-713498",
  "org.scalablytyped" %%% "ionic__utils-process" % "0.1.0-37ffa6",
  "org.scalablytyped" %%% "ionic__utils-stream" % "0.0.1-34a482",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "0.0.1-de4585",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-7a74e5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-15c8b6",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-fdc7f3",
  "org.scalablytyped" %%% "tslib" % "1.9.3-f320f9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        