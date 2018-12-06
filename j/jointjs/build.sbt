organization := "org.scalablytyped"
name := "jointjs"
version := "2.2.1-d7d540"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20181206Z-ce42f2",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20180910Z-000c2f",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20180910Z-7fcfa6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181206Z-03d301",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-3181aa",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180910Z-6762b5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        