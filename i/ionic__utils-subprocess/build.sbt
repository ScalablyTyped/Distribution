organization := "org.scalablytyped"
name := "ionic__utils-subprocess"
version := "0.1.0-c55222"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "cross-spawn" % "6.0-dt-20190228Z-358b5f",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-98f533",
  "org.scalablytyped" %%% "fs-extra" % "5.0-dt-20190212Z-d1d8d8",
  "org.scalablytyped" %%% "ionic__utils-array" % "0.0.1-a4e4e8",
  "org.scalablytyped" %%% "ionic__utils-fs" % "1.2.0-01e2da",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-7b7b54",
  "org.scalablytyped" %%% "ionic__utils-process" % "0.1.0-8177cd",
  "org.scalablytyped" %%% "ionic__utils-stream" % "0.0.1-488c0b",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "0.0.1-97fb12",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-001cca",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-26977f",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        