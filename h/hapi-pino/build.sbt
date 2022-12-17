organization := "org.scalablytyped"
name := "hapi-pino"
version := "11.0.1-debe38"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-783f73",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-bc591b",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-353fc4",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-998f17",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-31fcc8",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-2f55b3",
  "org.scalablytyped" %%% "joi" % "17.7.0-7c28f2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "pino" % "8.7.0-3f0d6e",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-02af79",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-23665c",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
