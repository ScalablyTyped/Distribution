organization := "org.scalablytyped"
name := "iitc"
version := "0.30-dt-20230320Z-f16215"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-852eb7",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221231Z-60047c",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20211202Z-d06211",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20230429Z-f7aef8",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-227892",
  "org.scalablytyped" %%% "spectrum" % "1.8-dt-20220624Z-0657ad",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-d6b3c2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
