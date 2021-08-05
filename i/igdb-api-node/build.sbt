organization := "org.scalablytyped"
name := "igdb-api-node"
version := "5.0-dt-20201103Z-c5ee6e"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "apicalypse" % "0.1-dt-20200323Z-b3218e",
  "org.scalablytyped" %%% "axios" % "0.21.0-0a9944",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
