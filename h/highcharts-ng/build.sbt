organization := "com.scalablytyped"
name := "highcharts-ng"
version := "0.0.8-dt-20180910Z-71e192"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-60feb0",
  "com.scalablytyped" %%% "highcharts" % "4.2.6-dt-20181104Z-991715",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        