organization := "org.scalablytyped"
name := "material__drawer"
version := "14.0.0-cbb012"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-3fe4c6",
  "org.scalablytyped" %%% "material__dom" % "14.0.0-9818b5",
  "org.scalablytyped" %%% "material__list" % "14.0.0-228f83",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
