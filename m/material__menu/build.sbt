organization := "org.scalablytyped"
name := "material__menu"
version := "14.0.0-ca0626"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-d53a60",
  "org.scalablytyped" %%% "material__list" % "14.0.0-02b5e5",
  "org.scalablytyped" %%% "material__menu-surface" % "14.0.0-257109",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
