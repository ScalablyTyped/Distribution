organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-95e3d9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-3f5e62",
  "org.scalablytyped" %%% "es6-promise" % "4.2.5-b4a5cc",
  "org.scalablytyped" %%% "js-yaml" % "3.11-dt-20181220Z-0e3b7c",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20180919Z-8d52c0",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "ono" % "4.0.11-0cbb8e",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180214Z-8bf416")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        