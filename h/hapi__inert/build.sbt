organization := "org.scalablytyped"
name := "hapi__inert"
version := "5.2-dt-20211202Z-7a5138"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-d618fe",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-b18962",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-36dfc6",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-2a0faa",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-2509e5",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-43ad88",
  "org.scalablytyped" %%% "joi" % "17.7.0-d79f84",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
