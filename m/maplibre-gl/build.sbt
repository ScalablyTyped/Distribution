organization := "org.scalablytyped"
name := "maplibre-gl"
version := "2.4.0-3227d7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-fa1356",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-0d1815",
  "org.scalablytyped" %%% "mapbox__mapbox-gl-supported" % "2.0.1-ebeb3b",
  "org.scalablytyped" %%% "mapbox__point-geometry" % "0.1-dt-20220121Z-ba4cdf",
  "org.scalablytyped" %%% "mapbox__tiny-sdf" % "2.0.5-f52124",
  "org.scalablytyped" %%% "mapbox__vector-tile" % "1.3-dt-20220329Z-a3631d",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "pbf" % "3.0-dt-20211202Z-572e20",
  "org.scalablytyped" %%% "potpack" % "1.0.2-3c4d9d",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
