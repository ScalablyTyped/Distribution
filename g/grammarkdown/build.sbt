organization := "org.scalablytyped"
name := "grammarkdown"
version := "3.2.0-d3d263"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "esfx__async-canceltoken" % "1.0.0-pre.41-00a35b",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.41-87163f",
  "org.scalablytyped" %%% "esfx__canceltoken" % "1.0.0-pre.41-7045a4",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.41-80d572",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
