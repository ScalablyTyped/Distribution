organization := "org.scalablytyped"
name := "leaflet_dot_vectorgrid"
version := "1.3-dt-20220720Z-feb186"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-12a811",
  "org.scalablytyped" %%% "geojson-vt" % "3.2-dt-20220719Z-51456b",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20221015Z-bf31a8",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
