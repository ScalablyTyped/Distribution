organization := "org.scalablytyped"
name := "iitc"
version := "0.30-dt-20230320Z-24a7fe"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-f1db3d",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221231Z-11244e",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20230518Z-379f04",
  "org.scalablytyped" %%% "leaflet" % "1.9-dt-20230429Z-feed91",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-ee1324",
  "org.scalablytyped" %%% "spectrum" % "1.8-dt-20220624Z-9d577f",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-475d8d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
