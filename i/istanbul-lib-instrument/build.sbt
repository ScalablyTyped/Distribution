organization := "org.scalablytyped"
name := "istanbul-lib-instrument"
version := "1.7-dt-20180611Z-f4a728"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "babel-types" % "7.0-dt-20180613Z-7dc4d7",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "1.1-dt-20180214Z-8fa601",
  "org.scalablytyped" %%% "source-map" % "0.7.3-242c07",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        