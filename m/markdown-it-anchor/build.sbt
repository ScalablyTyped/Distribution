organization := "org.scalablytyped"
name := "markdown-it-anchor"
version := "8.6.5-3f19b2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "linkify-it" % "3.0.2-dt-20220818Z-6ddc67",
  "org.scalablytyped" %%% "markdown-it" % "12.2-dt-20211202Z-931530",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20211202Z-e17539",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
