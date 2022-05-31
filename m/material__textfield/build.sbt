organization := "org.scalablytyped"
name := "material__textfield"
version := "8.0.0-4f2931"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "8.0.0-9f15fe",
  "org.scalablytyped" %%% "material__floating-label" % "8.0.0-b3d038",
  "org.scalablytyped" %%% "material__line-ripple" % "8.0.0-54f4e0",
  "org.scalablytyped" %%% "material__notched-outline" % "8.0.0-ef1df7",
  "org.scalablytyped" %%% "material__ripple" % "8.0.0-256603",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
