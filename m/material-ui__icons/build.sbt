organization := "org.scalablytyped"
name := "material-ui__icons"
version := "4.11.3-16192b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-1a0cc0",
  "org.scalablytyped" %%% "jss" % "10.9.2-430df5",
  "org.scalablytyped" %%% "material-ui__core" % "4.12.4-6c2047",
  "org.scalablytyped" %%% "material-ui__styles" % "4.11.5-12aaa1",
  "org.scalablytyped" %%% "material-ui__system" % "4.12.2-17ef89",
  "org.scalablytyped" %%% "material-ui__types" % "5.1.0-32108b",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-833116",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-16e74e",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
