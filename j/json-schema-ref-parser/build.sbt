organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-defd1a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "es6-promise" % "4.2.6-2d0bb0",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-f1d446",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-f1101a",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "ono" % "4.0.11-a70ea3",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180214Z-7903c8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        