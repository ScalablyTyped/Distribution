organization := "org.scalablytyped"
name := "markdown-it-attrs"
version := "4.1-dt-20211202Z-a5b3c8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "linkify-it" % "3.0.2-dt-20220818Z-5c6844",
  "org.scalablytyped" %%% "markdown-it" % "12.2-dt-20211202Z-8bf795",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20211202Z-1e0989",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
