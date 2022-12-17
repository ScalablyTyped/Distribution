organization := "org.scalablytyped"
name := "material-ui__core"
version := "4.12.4-7c8ab1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-5a8cad",
  "org.scalablytyped" %%% "jss" % "10.9.2-a541df",
  "org.scalablytyped" %%% "material-ui__styles" % "4.11.5-991648",
  "org.scalablytyped" %%% "material-ui__system" % "4.12.2-b7ac3e",
  "org.scalablytyped" %%% "material-ui__types" % "5.1.0-18afe7",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-7ce3a3",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
