organization := "org.scalablytyped"
name := "handsontable"
version := "12.1.3-c2ecd6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chevrotain" % "10.3.0-547874",
  "org.scalablytyped" %%% "chevrotain__types" % "10.3.0-87e8cd",
  "org.scalablytyped" %%% "hyperformula" % "2.1.0-b2b3b5",
  "org.scalablytyped" %%% "moment" % "2.29.4-dbaff2",
  "org.scalablytyped" %%% "numbro" % "2.3.6-f5e3a2",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20220704Z-51ae35",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tiny-emitter" % "2.1.0-c297f6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
