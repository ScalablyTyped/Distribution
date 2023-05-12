organization := "org.scalablytyped"
name := "handsontable"
version := "12.3.3-a0074d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chevrotain" % "10.5.0-bf0566",
  "org.scalablytyped" %%% "chevrotain__types" % "10.5.0-2661cd",
  "org.scalablytyped" %%% "hyperformula" % "2.4.0-398047",
  "org.scalablytyped" %%% "moment" % "2.29.4-62c55d",
  "org.scalablytyped" %%% "numbro" % "2.3.6-1f20b7",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20220704Z-a68dc8",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tiny-emitter" % "2.1.0-ea0627")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
