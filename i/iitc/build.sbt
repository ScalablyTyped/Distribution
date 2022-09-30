organization := "org.scalablytyped"
name := "iitc"
version := "0.30-dt-20211202Z-09dc53"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-fa1356",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-894e6b",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20211202Z-f18a23",
  "org.scalablytyped" %%% "leaflet" % "1.8-dt-20220915Z-835dbd",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-1d3faa",
  "org.scalablytyped" %%% "spectrum" % "1.8-dt-20220624Z-3ac55e",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "tinycolor2" % "1.4-dt-20211202Z-4efd87")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
