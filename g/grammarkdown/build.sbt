organization := "org.scalablytyped"
name := "grammarkdown"
version := "2.2.7-a0c0e0"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "esfx__async-canceltoken" % "1.0.0-pre.13-93c46b",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.13-2df42d",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.13-e7f3ee",
  "org.scalablytyped" %%% "prex" % "0.4.7-c36538",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
