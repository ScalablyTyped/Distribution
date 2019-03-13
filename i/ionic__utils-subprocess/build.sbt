organization := "org.scalablytyped"
name := "ionic__utils-subprocess"
version := "0.1.0-31fc03"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cross-spawn" % "6.0-dt-20190228Z-e6396a",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-4b79e1",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-8ee0cf",
  "org.scalablytyped" %%% "ionic__utils-array" % "0.0.1-9de01e",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.2.0-ab6092",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-cc0668",
  "org.scalablytyped" %%% "ionic__utils-process" % "0.1.0-3a0fdc",
  "org.scalablytyped" %%% "ionic__utils-stream" % "0.0.1-15e784",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "0.0.1-7b4e18",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190311Z-601106",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-720290",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-3c1239",
  "org.scalablytyped" %%% "tslib" % "1.9.3-28a6ab")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        