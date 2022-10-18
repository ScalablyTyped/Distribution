organization := "org.scalablytyped"
name := "leaflet-geosearch"
version := "3.7.0-cbd06d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-feb617",
  "org.scalablytyped" %%% "google_dot_maps" % "3.50-dt-20221007Z-c0be1b",
  "org.scalablytyped" %%% "googlemaps__js-api-loader" % "1.14.3-01002a",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20221015Z-b1ee87",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
