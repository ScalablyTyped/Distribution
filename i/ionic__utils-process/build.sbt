organization := "org.scalablytyped"
name := "ionic__utils-process"
version := "0.1.0-8177cd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-98f533",
  "org.scalablytyped" %%% "ionic__utils-object" % "0.0.1-7b7b54",
  "org.scalablytyped" %%% "ionic__utils-terminal" % "0.0.1-97fb12",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tree-kill" % "1.2.1-26977f",
  "org.scalablytyped" %%% "tslib" % "1.9.3-446b32")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        