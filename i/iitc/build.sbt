organization := "org.scalablytyped"
name := "iitc"
version := "0.30-dt-20211202Z-48af6d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-c21ab7",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-20efda",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20211202Z-cec445",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20221015Z-9d848a",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-224716",
  "org.scalablytyped" %%% "spectrum" % "1.8-dt-20220624Z-02997d",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-a8c68b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
