organization := "org.scalablytyped"
name := "material-ui__icons"
version := "4.11.3-967063"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-f01dc1",
  "org.scalablytyped" %%% "jss" % "10.9.2-673d08",
  "org.scalablytyped" %%% "material-ui__core" % "4.12.4-279f50",
  "org.scalablytyped" %%% "material-ui__styles" % "4.11.5-f8a0d0",
  "org.scalablytyped" %%% "material-ui__system" % "4.12.2-17cca2",
  "org.scalablytyped" %%% "material-ui__types" % "5.1.0-5fac70",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-fcd89f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
