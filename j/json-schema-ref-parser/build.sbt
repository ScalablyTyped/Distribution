organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-03e31b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-42ca48",
  "org.scalablytyped" %%% "es6-promise" % "4.2.5-1d5b4c",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-190fee",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180920Z-2d8a40",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "ono" % "4.0.11-878e9e",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180910Z-aa8395")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        