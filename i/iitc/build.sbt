organization := "org.scalablytyped"
name := "iitc"
version := "0.30-dt-20201111Z-a3c275"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20201002Z-2461bc",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-b65a9c",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20201002Z-c8616b",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20201012Z-9366b5",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-00b6a0",
  "org.scalablytyped" %%% "spectrum" % "1.5.1-dt-20201002Z-9173ab",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20201002Z-5d42bd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
