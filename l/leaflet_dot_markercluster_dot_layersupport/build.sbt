organization := "org.scalablytyped"
name := "leaflet_dot_markercluster_dot_layersupport"
version := "1.0-dt-20180214Z-d3528d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-7de14c",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20200117Z-9a0d86",
  "org.scalablytyped" %%% "leaflet_dot_markercluster" % "1.4-dt-20191223Z-e930c0",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
