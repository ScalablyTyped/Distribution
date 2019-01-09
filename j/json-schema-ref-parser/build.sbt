organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-6b2b6e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-7e0ea5",
  "org.scalablytyped" %%% "es6-promise" % "4.2.5-67c823",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-3d9c80",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180919Z-325b81",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "ono" % "4.0.11-fd7611",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180214Z-a2779f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        