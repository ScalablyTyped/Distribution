organization := "com.scalablytyped"
name := "istanbul-lib-instrument"
version := "1.7-dt-20181102Z-cf8f3a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "babel-types" % "7.0-dt-20181102Z-fa77e1",
  "com.scalablytyped" %%% "istanbul-lib-coverage" % "1.1-dt-20181102Z-4f7e8a",
  "com.scalablytyped" %%% "source-map" % "0.7.3-771552",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        