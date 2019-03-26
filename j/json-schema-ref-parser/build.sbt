organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-61433c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-e59bbf",
  "org.scalablytyped" %%% "es6-promise" % "4.2.6-d04919",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-26cfe6",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-7a5584",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "ono" % "4.0.11-15176e",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20190322Z-3fbe27")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        