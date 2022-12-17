organization := "org.scalablytyped"
name := "handsontable"
version := "12.2.0-894de9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chevrotain" % "10.3.0-27e438",
  "org.scalablytyped" %%% "chevrotain__types" % "10.3.0-ad723c",
  "org.scalablytyped" %%% "hyperformula" % "2.1.0-1b21b7",
  "org.scalablytyped" %%% "moment" % "2.29.4-bc3b08",
  "org.scalablytyped" %%% "numbro" % "2.3.6-70492f",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20220704Z-7099b6",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "tiny-emitter" % "2.1.0-35a02d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
