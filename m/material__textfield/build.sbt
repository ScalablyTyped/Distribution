organization := "org.scalablytyped"
name := "material__textfield"
version := "14.0.0-c0c239"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-6f911e",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-77fe35",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-6eabb0",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-3a7c30",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-195ed4",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
