organization := "org.scalablytyped"
name := "material-ui__icons"
version := "4.11.3-6a2742"
scalaVersion := "3.2.2-RC1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-b003b4",
  "org.scalablytyped" %%% "enzyme" % "3.10-dt-20220818Z-477cf5",
  "org.scalablytyped" %%% "jss" % "10.9.2-45913c",
  "org.scalablytyped" %%% "material-ui__core" % "4.12.4-62b3bc",
  "org.scalablytyped" %%% "material-ui__styles" % "4.11.5-6c907f",
  "org.scalablytyped" %%% "material-ui__system" % "4.12.2-feaf15",
  "org.scalablytyped" %%% "material-ui__types" % "5.1.0-5f50f4",
  "org.scalablytyped" %%% "popper_dot_js" % "1.16.1-118e00",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-ddcd58",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-0ec907",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-864a4c",
  "org.scalablytyped" %%% "std" % "4.9-448261")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
