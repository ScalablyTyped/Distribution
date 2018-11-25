organization := "com.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-1252d7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-8c87a5",
  "com.scalablytyped" %%% "es6-promise" % "4.2.5-5892ce",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "js-yaml" % "3.11-dt-20180910Z-fd3121",
  "com.scalablytyped" %%% "json-schema" % "7.0-dt-20180920Z-055e3d",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "ono" % "4.0.10-af7996",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180910Z-29e6ec",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        