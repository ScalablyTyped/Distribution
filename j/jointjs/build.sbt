organization := "org.scalablytyped"
name := "jointjs"
version := "2.2.1-7e6e0b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20181124Z-93edff",
  "org.scalablytyped" %%% "dagre" % "0.7-dt-20180329Z-7e6171",
  "org.scalablytyped" %%% "graphlib" % "2.1.1-dt-20180214Z-280fd6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-c4ac04",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-b7dcf8",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3a6abd",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180808Z-09fcd3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        