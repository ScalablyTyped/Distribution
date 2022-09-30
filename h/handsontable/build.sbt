organization := "org.scalablytyped"
name := "handsontable"
version := "12.1.3-9e9043"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chevrotain" % "10.3.0-14f980",
  "org.scalablytyped" %%% "chevrotain__types" % "10.3.0-dbad0c",
  "org.scalablytyped" %%% "hyperformula" % "2.1.0-f4bf71",
  "org.scalablytyped" %%% "moment" % "2.29.4-b4e779",
  "org.scalablytyped" %%% "numbro" % "2.3.6-1087ca",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20220704Z-ee506c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "tiny-emitter" % "2.1.0-5f4551")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
