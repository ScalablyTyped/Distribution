organization := "org.scalablytyped"
name := "hapi-pino"
version := "11.0.1-445f0d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-b5841b",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-5bffc2",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-cb7b35",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-818f68",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-c31a42",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-78e4ec",
  "org.scalablytyped" %%% "joi" % "17.6.4-77dbda",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "pino" % "8.7.0-1e72c0",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.0.0-e4959c",
  "org.scalablytyped" %%% "sonic-boom" % "3.2.0-d1def4",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
