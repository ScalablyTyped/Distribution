organization := "org.scalablytyped"
name := "handsontable"
version := "12.2.0-0e658d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chevrotain" % "10.3.0-403d16",
  "org.scalablytyped" %%% "chevrotain__types" % "10.3.0-14e882",
  "org.scalablytyped" %%% "hyperformula" % "2.1.0-e32499",
  "org.scalablytyped" %%% "moment" % "2.29.4-96b3b9",
  "org.scalablytyped" %%% "numbro" % "2.3.6-f5e3a2",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20220704Z-149949",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "tiny-emitter" % "2.1.0-806491")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
