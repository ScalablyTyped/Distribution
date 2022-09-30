organization := "org.scalablytyped"
name := "material-ui__core"
version := "4.12.4-8a8e98"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-6d7c61",
  "org.scalablytyped" %%% "jss" % "10.9.2-65e5c9",
  "org.scalablytyped" %%% "material-ui__styles" % "4.11.5-c14df8",
  "org.scalablytyped" %%% "material-ui__system" % "4.12.2-55e4bd",
  "org.scalablytyped" %%% "material-ui__types" % "5.1.0-c573ef",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-34f40d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
