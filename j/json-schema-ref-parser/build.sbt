organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-444233"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-0e2c03",
  "org.scalablytyped" %%% "es6-promise" % "4.2.5-634c38",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-6e1cbe",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190201Z-e0972a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "ono" % "4.0.11-d76143",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180214Z-49163f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        