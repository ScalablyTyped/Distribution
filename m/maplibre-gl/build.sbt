organization := "org.scalablytyped"
name := "maplibre-gl"
version := "2.4.0-cbfa92"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-c21ab7",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-8ec21e",
  "org.scalablytyped" %%% "mapbox__mapbox-gl-supported" % "2.0.1-61c65a",
  "org.scalablytyped" %%% "mapbox__point-geometry" % "0.1-dt-20220121Z-b79d69",
  "org.scalablytyped" %%% "mapbox__tiny-sdf" % "2.0.5-cd2136",
  "org.scalablytyped" %%% "mapbox__vector-tile" % "1.3-dt-20220329Z-9f911b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "pbf" % "3.0-dt-20211202Z-ca85b8",
  "org.scalablytyped" %%% "potpack" % "1.0.2-d3c0d0",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
