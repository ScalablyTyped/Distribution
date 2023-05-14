organization := "org.scalablytyped"
name := "mapbox__rehype-prism"
version := "0.8-dt-20230328Z-fc30af"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-015615",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "unified" % "10.1.2-1ef316",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20221230Z-5d1d9b",
  "org.scalablytyped" %%% "vfile" % "5.3.7-78a4c9",
  "org.scalablytyped" %%% "vfile-message" % "3.1.4-a1be56")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
