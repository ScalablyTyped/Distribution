organization := "org.scalablytyped"
name := "leaflet-geosearch"
version := "3.7.0-c0f2c0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-12a811",
  "org.scalablytyped" %%% "google_dot_maps" % "3.50-dt-20221101Z-28944b",
  "org.scalablytyped" %%% "googlemaps__js-api-loader" % "1.14.3-65158f",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20221015Z-bf31a8",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
