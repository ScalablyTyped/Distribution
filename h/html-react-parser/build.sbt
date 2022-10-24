organization := "org.scalablytyped"
name := "html-react-parser"
version := "3.0.4-e87ca9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-044aba",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-b522a9",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-1b82ef",
  "org.scalablytyped" %%% "domutils" % "3.0.1-0b2a23",
  "org.scalablytyped" %%% "htmlparser2" % "8.0.1-febe1b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-16e74e",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
