organization := "org.scalablytyped"
name := "leaflet-geosearch"
version := "3.7.0-82016b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-c7b900",
  "org.scalablytyped" %%% "google_dot_maps" % "3.50-dt-20221007Z-18f288",
  "org.scalablytyped" %%% "googlemaps__js-api-loader" % "1.14.3-feb8a7",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20221015Z-ca4fdf",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
