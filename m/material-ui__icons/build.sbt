organization := "org.scalablytyped"
name := "material-ui__icons"
version := "4.11.3-e1d718"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-9dd215",
  "org.scalablytyped" %%% "jss" % "10.9.2-68fe49",
  "org.scalablytyped" %%% "material-ui__core" % "4.12.4-2fe06f",
  "org.scalablytyped" %%% "material-ui__styles" % "4.11.5-6ba0eb",
  "org.scalablytyped" %%% "material-ui__system" % "4.12.2-aa2e28",
  "org.scalablytyped" %%% "material-ui__types" % "5.1.0-576bdb",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-4194ce",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
