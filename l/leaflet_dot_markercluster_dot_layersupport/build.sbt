organization := "org.scalablytyped"
name := "leaflet_dot_markercluster_dot_layersupport"
version := "1.0-dt-20180214Z-7e22d8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-0f225d",
  "org.scalablytyped" %%% "leaflet" % "1.4-dt-20190221Z-1f965d",
  "org.scalablytyped" %%% "leaflet_dot_markercluster" % "1.4-dt-20190326Z-a66b1b",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        