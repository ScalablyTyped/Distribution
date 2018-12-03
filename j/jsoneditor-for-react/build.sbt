organization := "com.scalablytyped"
name := "jsoneditor-for-react"
version := "0.0-dt-20180910Z-9a3b16"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ace" % "0.0-unknown-dt-20180910Z-cac05e",
  "com.scalablytyped" %%% "csstype" % "2.5.7-d075d3",
  "com.scalablytyped" %%% "jsoneditor" % "v5.19.0-dt-20180910Z-287839",
  "com.scalablytyped" %%% "prop-types" % "15.5-dt-20180927Z-c5aad4",
  "com.scalablytyped" %%% "react" % "16.7-dt-20181203Z-843f9f",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        