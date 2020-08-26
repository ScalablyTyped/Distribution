organization := "org.scalablytyped"
name := "leaflet_dot_markercluster_dot_layersupport"
version := "1.0-dt-20200515Z-63d140"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20200515Z-7b0d2d",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20200720Z-d0797b",
  "org.scalablytyped" %%% "leaflet_dot_markercluster" % "1.4-dt-20200515Z-8f1692",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
