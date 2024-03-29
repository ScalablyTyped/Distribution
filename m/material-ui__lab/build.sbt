organization := "org.scalablytyped"
name := "material-ui__lab"
version := "4.0.0-alpha.61-0e2d36"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20230415Z-747887",
  "org.scalablytyped" %%% "jss" % "10.10.0-9bc62a",
  "org.scalablytyped" %%% "material-ui__core" % "4.12.4-32830e",
  "org.scalablytyped" %%% "material-ui__styles" % "4.11.5-b1368e",
  "org.scalablytyped" %%% "material-ui__system" % "4.12.2-b4c414",
  "org.scalablytyped" %%% "material-ui__types" % "5.1.0-8cf931",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-5b023e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
