organization := "org.scalablytyped"
name := "hast-util-to-parse5"
version := "7.0.0-80567e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-8965ce",
  "org.scalablytyped" %%% "property-information" % "6.2.0-96484b",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20221230Z-9eb15f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
