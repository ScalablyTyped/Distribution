organization := "org.scalablytyped"
name := "markdown-it-emoji"
version := "1.4-dt-20200621Z-0a8de7"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20200515Z-5e2d67",
  "org.scalablytyped" %%% "markdown-it" % "v10.0.0-dt-20201109Z-5d9c74",
  "org.scalablytyped" %%% "mdurl" % "1.0-dt-20200515Z-6e5cd8",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
