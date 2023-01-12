organization := "org.scalablytyped"
name := "hapipal__toys"
version := "3.0-dt-20211202Z-b7bb21"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hapi__boom" % "10.0.0-e943fd",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20211202Z-35b843",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20221019Z-8d60cc",
  "org.scalablytyped" %%% "hapi__iron" % "7.0.0-bdfda0",
  "org.scalablytyped" %%% "hapi__mimos" % "7.0.0-e1b709",
  "org.scalablytyped" %%% "hapi__shot" % "6.0.0-dab5bb",
  "org.scalablytyped" %%% "joi" % "17.7.0-c612b4",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
