organization := "com.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-d3b8c6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e9dd4f",
  "com.scalablytyped" %%% "es6-promise" % "4.2.5-92e73a",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-2da08f",
  "com.scalablytyped" %%% "json-schema" % "7.0-dt-20180920Z-ba0128",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "ono" % "4.0.10-5cf79c",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180910Z-1e4984",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        