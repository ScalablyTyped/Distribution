organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-c3d80c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-c0f3d2",
  "org.scalablytyped" %%% "es6-promise" % "4.2.6-e10913",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-9bda5b",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-5b2cd9",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "ono" % "4.0.11-d623b0",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180214Z-fc87f0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        