organization := "org.scalablytyped"
name := "handsontable"
version := "12.1.2-8fd971"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chevrotain" % "10.3.0-f5bc23",
  "org.scalablytyped" %%% "chevrotain__types" % "10.3.0-25317b",
  "org.scalablytyped" %%% "hyperformula" % "2.1.0-f1bcf2",
  "org.scalablytyped" %%% "moment" % "2.29.4-af05ac",
  "org.scalablytyped" %%% "numbro" % "2.3.6-1087ca",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20220704Z-a9aa7e",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "tiny-emitter" % "2.1.0-0feba3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
