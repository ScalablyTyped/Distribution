organization := "org.scalablytyped"
name := "mapbox__vector-tile"
version := "1.3-dt-20220329Z-d36a6e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-c7b900",
  "org.scalablytyped" %%% "mapbox__point-geometry" % "0.1-dt-20220121Z-0c208e",
  "org.scalablytyped" %%% "pbf" % "3.0-dt-20211202Z-70fd97",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
