organization := "org.scalablytyped"
name := "level-sublevel"
version := "0.0-unknown-dt-20220818Z-5ea48b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-leveldown" % "7.2-dt-20220329Z-a0ac45",
  "org.scalablytyped" %%% "level-errors" % "3.0-dt-20211202Z-6cef6c",
  "org.scalablytyped" %%% "levelup" % "5.1-dt-20220717Z-f87c64",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
