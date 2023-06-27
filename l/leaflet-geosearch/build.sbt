organization := "org.scalablytyped"
name := "leaflet-geosearch"
version := "3.8.0-026516"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-f1db3d",
  "org.scalablytyped" %%% "google_dot_maps" % "3.53-dt-20230608Z-a84da2",
  "org.scalablytyped" %%% "googlemaps__js-api-loader" % "1.15.1-843498",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20230429Z-feed91",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
