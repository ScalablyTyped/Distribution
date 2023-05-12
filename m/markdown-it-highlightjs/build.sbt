organization := "org.scalablytyped"
name := "markdown-it-highlightjs"
version := "3.3-dt-20211202Z-f4dbe6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "linkify-it" % "3.0.2-dt-20220818Z-680629",
  "org.scalablytyped" %%% "markdown-it" % "12.2-dt-20211202Z-7f95c4",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20211202Z-7bbe4c",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
