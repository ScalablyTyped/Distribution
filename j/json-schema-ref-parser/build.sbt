organization := "com.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-f6b363"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181102Z-fdaa94",
  "com.scalablytyped" %%% "es6-promise" % "4.2.5-ac3686",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20181102Z-0a1057",
  "com.scalablytyped" %%% "json-schema" % "7.0-dt-20181102Z-cfe007",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "ono" % "4.0.10-6c2735",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20181102Z-b85c88",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        