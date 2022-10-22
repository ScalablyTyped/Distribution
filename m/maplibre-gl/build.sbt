organization := "org.scalablytyped"
name := "maplibre-gl"
version := "2.4.0-232e4b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-feb617",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-071b13",
  "org.scalablytyped" %%% "mapbox__mapbox-gl-supported" % "2.0.1-2b270a",
  "org.scalablytyped" %%% "mapbox__point-geometry" % "0.1-dt-20220121Z-9a0ff8",
  "org.scalablytyped" %%% "mapbox__tiny-sdf" % "2.0.5-c5dbbe",
  "org.scalablytyped" %%% "mapbox__vector-tile" % "1.3-dt-20220329Z-4764c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "pbf" % "3.0-dt-20211202Z-7ab79e",
  "org.scalablytyped" %%% "potpack" % "1.0.2-64cbbf",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
