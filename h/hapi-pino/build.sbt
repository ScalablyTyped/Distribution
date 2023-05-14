organization := "org.scalablytyped"
name := "hapi-pino"
version := "12.1.0-6e3511"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.1-50c06c",
  "org.scalablytyped" %%% "hapi__catbox" % "12.1.1-59ddc5",
  "org.scalablytyped" %%% "hapi__hapi" % "21.3.2-675d8c",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.1-56bdce",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.1-1d1e74",
  "org.scalablytyped" %%% "hapi__podium" % "5.0.1-a01759",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.1-2e54fd",
  "org.scalablytyped" %%% "hapi__statehood" % "8.1.1-f54731",
  "org.scalablytyped" %%% "joi" % "17.9.2-abf248",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "pino" % "8.14.1-57e6e7",
  "org.scalablytyped" %%% "pino-std-serializers" % "6.2.1-cf6f71",
  "org.scalablytyped" %%% "sonic-boom" % "3.3.0-92e00d",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
