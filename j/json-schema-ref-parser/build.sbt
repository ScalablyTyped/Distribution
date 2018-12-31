organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-1d1b57"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-2025c9",
  "org.scalablytyped" %%% "es6-promise" % "4.2.5-e0147b",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-43e82c",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180919Z-8d9f36",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "ono" % "4.0.11-271b86",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180214Z-232047")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        