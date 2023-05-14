organization := "org.scalablytyped"
name := "maplibre-gl"
version := "2.4.0-9876fc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-852eb7",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-a497a6",
  "org.scalablytyped" %%% "mapbox__mapbox-gl-supported" % "2.0.1-c4d6f5",
  "org.scalablytyped" %%% "mapbox__point-geometry" % "0.1-dt-20220121Z-40f9d2",
  "org.scalablytyped" %%% "mapbox__tiny-sdf" % "2.0.5-4a22ee",
  "org.scalablytyped" %%% "mapbox__vector-tile" % "1.3-dt-20220329Z-354d2c",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "pbf" % "3.0-dt-20211202Z-d4653c",
  "org.scalablytyped" %%% "potpack" % "1.0.2-64511d",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
