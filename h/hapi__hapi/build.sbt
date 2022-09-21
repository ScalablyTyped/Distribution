organization := "org.scalablytyped"
name := "hapi__hapi"
version := "20.0-dt-20220525Z-0d28aa"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-dca375",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-4218e0",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-92431e",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-eddb9d",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-8d41cf",
  "org.scalablytyped" %%% "joi" % "17.6.0-f7916a",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
