organization := "org.scalablytyped"
name := "markerclustererplus"
version := "2.1-dt-20180214Z-3ba94c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "google-maps" % "3.2.1-dt-20180214Z-9e1eb0",
  "org.scalablytyped" %%% "googlemaps" % "3.30-dt-20190219Z-fefe5d",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        