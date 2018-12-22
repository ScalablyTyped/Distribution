organization := "org.scalablytyped"
name := "markerclustererplus"
version := "2.1-dt-20180214Z-b3067f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "google-maps" % "3.2.1-dt-20180214Z-3def42",
  "org.scalablytyped" %%% "googlemaps" % "3.30-dt-20181022Z-09c42e",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        