organization := "org.scalablytyped"
name := "iitc"
version := "0.30-dt-20201111Z-40a87d"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20201002Z-ae1993",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-87319b",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20201002Z-7c410a",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20201012Z-874a0d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-1b62ce",
  "org.scalablytyped" %%% "spectrum" % "1.5.1-dt-20201002Z-7a22ff",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20201002Z-6e3f6e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
