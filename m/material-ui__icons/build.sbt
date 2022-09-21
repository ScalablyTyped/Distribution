organization := "org.scalablytyped"
name := "material-ui__icons"
version := "4.11.3-b2263d"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-04f4a7",
  "org.scalablytyped" %%% "jss" % "10.9.2-08d68e",
  "org.scalablytyped" %%% "material-ui__core" % "4.12.4-e5ede7",
  "org.scalablytyped" %%% "material-ui__styles" % "4.11.5-16e573",
  "org.scalablytyped" %%% "material-ui__system" % "4.12.2-2277ba",
  "org.scalablytyped" %%% "material-ui__types" % "5.1.0-8a5770",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-b3b55d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
