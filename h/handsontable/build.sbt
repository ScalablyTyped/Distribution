organization := "org.scalablytyped"
name := "handsontable"
version := "12.2.0-66b518"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chevrotain" % "10.3.0-c7df6a",
  "org.scalablytyped" %%% "chevrotain__types" % "10.3.0-d4ce6d",
  "org.scalablytyped" %%% "hyperformula" % "2.1.0-04799b",
  "org.scalablytyped" %%% "moment" % "2.29.4-336174",
  "org.scalablytyped" %%% "numbro" % "2.3.6-70492f",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20220704Z-e865be",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "tiny-emitter" % "2.1.0-999a3b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
