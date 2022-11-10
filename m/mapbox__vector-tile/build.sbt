organization := "org.scalablytyped"
name := "mapbox__vector-tile"
version := "1.3-dt-20220329Z-71882f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-93246d",
  "org.scalablytyped" %%% "mapbox__point-geometry" % "0.1-dt-20220121Z-65536e",
  "org.scalablytyped" %%% "pbf" % "3.0-dt-20211202Z-3b2a55",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
