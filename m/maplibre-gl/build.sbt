organization := "org.scalablytyped"
name := "maplibre-gl"
version := "2.4.0-0580e7"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-c7b900",
  "org.scalablytyped" %%% "gl-matrix" % "3.4.3-9a54c5",
  "org.scalablytyped" %%% "mapbox__mapbox-gl-supported" % "2.0.1-a86a08",
  "org.scalablytyped" %%% "mapbox__point-geometry" % "0.1-dt-20220121Z-0c208e",
  "org.scalablytyped" %%% "mapbox__tiny-sdf" % "2.0.5-047b10",
  "org.scalablytyped" %%% "mapbox__vector-tile" % "1.3-dt-20220329Z-d36a6e",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "pbf" % "3.0-dt-20211202Z-70fd97",
  "org.scalablytyped" %%% "potpack" % "1.0.2-6343d0",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
