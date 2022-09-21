organization := "org.scalablytyped"
name := "maplibre-gl"
version := "2.4.0-6edf9a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-5d61ed",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-b3347b",
  "org.scalablytyped" %%% "mapbox__mapbox-gl-supported" % "2.0.1-64d5b8",
  "org.scalablytyped" %%% "mapbox__point-geometry" % "0.1-dt-20220121Z-113911",
  "org.scalablytyped" %%% "mapbox__tiny-sdf" % "2.0.5-9c2018",
  "org.scalablytyped" %%% "mapbox__vector-tile" % "1.3-dt-20220329Z-d72255",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "pbf" % "3.0-dt-20211202Z-6f47b3",
  "org.scalablytyped" %%% "potpack" % "1.0.2-fe0b2d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
