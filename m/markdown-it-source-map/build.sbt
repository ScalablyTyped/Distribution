organization := "org.scalablytyped"
name := "markdown-it-source-map"
version := "0.1-dt-20230623Z-cf17fa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "linkify-it" % "3.0.2-dt-20220818Z-32fb90",
  "org.scalablytyped" %%% "markdown-it" % "12.2-dt-20211202Z-b77cf9",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20211202Z-7bbe4c",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
