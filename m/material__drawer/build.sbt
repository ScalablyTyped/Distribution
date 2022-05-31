organization := "org.scalablytyped"
name := "material__drawer"
version := "8.0.0-9bd5dd"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "material__base" % "8.0.0-9f15fe",
  "org.scalablytyped" %%% "material__dom" % "8.0.0-821e42",
  "org.scalablytyped" %%% "material__list" % "8.0.0-f160ef",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
