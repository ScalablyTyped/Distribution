organization := "org.scalablytyped"
name := "level"
version := "8.0.0-e4d09c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "abstract-level" % "1.0.3-cba9c6",
  "org.scalablytyped" %%% "browser-level" % "1.0.1-17aa04",
  "org.scalablytyped" %%% "classic-level" % "1.2.0-8a0f00",
  "org.scalablytyped" %%% "level-supports" % "4.0.1-f456ee",
  "org.scalablytyped" %%% "level-transcoder" % "1.0.1-7afc1b",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
