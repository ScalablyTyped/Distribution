organization := "org.scalablytyped"
name := "material__data-table"
version := "14.0.0-141ab1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "14.0.0-b7cc0b",
  "org.scalablytyped" %%% "material__checkbox" % "14.0.0-140bd6",
  "org.scalablytyped" %%% "material__ripple" % "14.0.0-160434",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
