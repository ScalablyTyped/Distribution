organization := "org.scalablytyped"
name := "material__textfield"
version := "14.0.0-02d464"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-d6291d",
  "org.scalablytyped" %%% "material__floating-label" % "14.0.0-8c0d1b",
  "org.scalablytyped" %%% "material__line-ripple" % "14.0.0-485933",
  "org.scalablytyped" %%% "material__notched-outline" % "14.0.0-f7cd92",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-e865af",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
