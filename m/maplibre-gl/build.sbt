organization := "org.scalablytyped"
name := "maplibre-gl"
version := "2.4.0-ceba01"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-89d05a",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-8dc8db",
  "org.scalablytyped" %%% "mapbox__mapbox-gl-supported" % "2.0.1-2a7770",
  "org.scalablytyped" %%% "mapbox__point-geometry" % "0.1-dt-20220121Z-97b2b7",
  "org.scalablytyped" %%% "mapbox__tiny-sdf" % "2.0.5-6353ba",
  "org.scalablytyped" %%% "mapbox__vector-tile" % "1.3-dt-20220329Z-24e0d3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "pbf" % "3.0-dt-20211202Z-0fa443",
  "org.scalablytyped" %%% "potpack" % "1.0.2-843500",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
