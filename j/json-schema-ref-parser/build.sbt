organization := "org.scalablytyped"
name := "json-schema-ref-parser"
version := "3.3.1-47790a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-779d70",
  "org.scalablytyped" %%% "es6-promise" % "4.2.6-adc327",
  "org.scalablytyped" %%% "js-yaml" % "3.12-dt-20190118Z-970eae",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20190212Z-8da10c",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "ono" % "4.0.11-db8ff3",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "z-schema" % "v3.16.0-dt-20180214Z-3b2373")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        