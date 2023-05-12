organization := "org.scalablytyped"
name := "leaflet-geosearch"
version := "3.8.0-b9c6b3"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-852eb7",
  "org.scalablytyped" %%% "google_dot_maps" % "3.53-dt-20230509Z-3a2831",
  "org.scalablytyped" %%% "googlemaps__js-api-loader" % "1.15.1-f51f3e",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20230429Z-f7aef8",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
