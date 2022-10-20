organization := "org.scalablytyped"
name := "level"
version := "8.0.0-c9d300"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-level" % "1.0.3-014a49",
  "org.scalablytyped" %%% "browser-level" % "1.0.1-56e050",
  "org.scalablytyped" %%% "classic-level" % "1.2.0-14ddda",
  "org.scalablytyped" %%% "level-supports" % "4.0.1-17e782",
  "org.scalablytyped" %%% "level-transcoder" % "1.0.1-50319b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
