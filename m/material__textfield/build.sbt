organization := "org.scalablytyped"
name := "material__textfield"
version := "14.0.0-3b85d7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-b7cc0b",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-2810ba",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-e1986d",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-944189",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-160434",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
