organization := "org.scalablytyped"
name := "handsontable"
version := "12.2.0-13a9fe"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chevrotain" % "10.3.0-6919ab",
  "org.scalablytyped" %%% "chevrotain__types" % "10.3.0-09b5e6",
  "org.scalablytyped" %%% "hyperformula" % "2.1.0-ad9f1f",
  "org.scalablytyped" %%% "moment" % "2.29.4-c1da03",
  "org.scalablytyped" %%% "numbro" % "2.3.6-1f20b7",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20220704Z-f808cb",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "tiny-emitter" % "2.1.0-2c8e2e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
