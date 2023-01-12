organization := "org.scalablytyped"
name := "maplibre-gl"
version := "2.4.0-bdbdd5"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-12a811",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-27ca14",
  "org.scalablytyped" %%% "mapbox__mapbox-gl-supported" % "2.0.1-442ef2",
  "org.scalablytyped" %%% "mapbox__point-geometry" % "0.1-dt-20220121Z-3ed882",
  "org.scalablytyped" %%% "mapbox__tiny-sdf" % "2.0.5-875a3e",
  "org.scalablytyped" %%% "mapbox__vector-tile" % "1.3-dt-20220329Z-acebe6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "pbf" % "3.0-dt-20211202Z-f0fabd",
  "org.scalablytyped" %%% "potpack" % "1.0.2-0917f4",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
