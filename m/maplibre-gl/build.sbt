organization := "org.scalablytyped"
name := "maplibre-gl"
version := "2.4.0-2011a0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-93246d",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-85a0f5",
  "org.scalablytyped" %%% "mapbox__mapbox-gl-supported" % "2.0.1-75ed37",
  "org.scalablytyped" %%% "mapbox__point-geometry" % "0.1-dt-20220121Z-65536e",
  "org.scalablytyped" %%% "mapbox__tiny-sdf" % "2.0.5-8427bd",
  "org.scalablytyped" %%% "mapbox__vector-tile" % "1.3-dt-20220329Z-71882f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "pbf" % "3.0-dt-20211202Z-3b2a55",
  "org.scalablytyped" %%% "potpack" % "1.0.2-eaa62f",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
