organization := "com.scalablytyped"
name := "jointjs"
version := "2.2.0-e42f89"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "backbone" % "1.3.3-dt-20181102Z-b0409a",
  "com.scalablytyped" %%% "dagre" % "0.7-dt-20181102Z-06c637",
  "com.scalablytyped" %%% "graphlib" % "2.1.1-dt-20181102Z-6e1d7f",
  "com.scalablytyped" %%% "jquery" % "3.3-dt-20181102Z-ef9974",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "sizzle" % "2.3-dt-20181102Z-6214b8",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "underscore" % "1.8-dt-20181102Z-35c601",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        