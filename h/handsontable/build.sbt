organization := "org.scalablytyped"
name := "handsontable"
version := "12.1.3-fd3d21"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chevrotain" % "10.3.0-6b6824",
  "org.scalablytyped" %%% "chevrotain__types" % "10.3.0-6a8e26",
  "org.scalablytyped" %%% "hyperformula" % "2.1.0-ce2132",
  "org.scalablytyped" %%% "moment" % "2.29.4-a513be",
  "org.scalablytyped" %%% "numbro" % "2.3.6-1087ca",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20220704Z-b0c3e8",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "tiny-emitter" % "2.1.0-60df4d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
