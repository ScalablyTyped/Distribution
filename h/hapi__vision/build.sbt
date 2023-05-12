organization := "org.scalablytyped"
name := "hapi__vision"
version := "5.5-dt-20221221Z-0b3fe9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.1-50c06c",
  "org.scalablytyped" %%% "hapi__catbox" % "12.1.1-59ddc5",
  "org.scalablytyped" %%% "hapi__hapi" % "21.3.2-251509",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.1-93a34c",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.1-1d1e74",
  "org.scalablytyped" %%% "hapi__podium" % "5.0.1-a01759",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.1-24b3c8",
  "org.scalablytyped" %%% "hapi__statehood" % "8.1.1-eece26",
  "org.scalablytyped" %%% "joi" % "17.9.2-271199",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
