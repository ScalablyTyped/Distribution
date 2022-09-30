organization := "org.scalablytyped"
name := "hapi-server-session"
version := "5.1-dt-20211202Z-0cd0dd"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-680d7d",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-45b641",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20220525Z-b2ba33",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-dcfbb6",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-7190cd",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-7d50fe",
  "org.scalablytyped" %%% "joi" % "17.6.2-2be84d",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
