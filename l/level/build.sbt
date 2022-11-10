organization := "org.scalablytyped"
name := "level"
version := "8.0.0-e9b67d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-level" % "1.0.3-40ca35",
  "org.scalablytyped" %%% "browser-level" % "1.0.1-32b7f6",
  "org.scalablytyped" %%% "classic-level" % "1.2.0-ca986b",
  "org.scalablytyped" %%% "level-supports" % "4.0.1-5ca3bd",
  "org.scalablytyped" %%% "level-transcoder" % "1.0.1-c3ae7d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
