organization := "org.scalablytyped"
name := "grammarkdown"
version := "3.2.0-ffd402"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "esfx__async-canceltoken" % "1.0.0-pre.41-00e9c1",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.41-50d6b9",
  "org.scalablytyped" %%% "esfx__canceltoken" % "1.0.0-pre.41-f1f4bb",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.41-13114e",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
