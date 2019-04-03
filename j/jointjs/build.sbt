organization := "org.scalablytyped"
name := "jointjs"
version := "2.2.1-ab352b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20190322Z-9e05d9",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20190212Z-ac0d4f",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20190322Z-0204be",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-6565a2",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-cab61f",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190326Z-a3148e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        