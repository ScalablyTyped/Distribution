organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-56f7a9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0c31be",
  "org.scalablytyped" %%% "es6-promise" % "4.2.5-e71a1c",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-948572",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180920Z-016b8b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "ono" % "4.0.10-475845",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180910Z-987199")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        