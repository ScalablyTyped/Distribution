organization := "org.scalablytyped"
name := "iitc"
version := "0.30-dt-20211202Z-e35e8d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-c7b900",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-9d6f35",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20211202Z-13bc62",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20221015Z-ca4fdf",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-cfd9ff",
  "org.scalablytyped" %%% "spectrum" % "1.8-dt-20220624Z-9168d7",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-d3d306")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
