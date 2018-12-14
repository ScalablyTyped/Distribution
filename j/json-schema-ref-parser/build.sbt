organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-01190e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-9f2619",
  "org.scalablytyped" %%% "es6-promise" % "4.2.5-7d92c7",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-816787",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180920Z-f46d58",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "ono" % "4.0.11-33bf74",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180910Z-39fe67")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        