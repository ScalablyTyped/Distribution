organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-527b19"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-315ade",
  "org.scalablytyped" %%% "es6-promise" % "4.2.5-4e8e9a",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-06ecaa",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180919Z-46ddbc",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "ono" % "4.0.11-c1f0f7",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180214Z-db30d4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        