organization := "org.scalablytyped"
name := "html-react-parser"
version := "3.0.4-2521be"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-d36eb3",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-424ef8",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-0ed4b9",
  "org.scalablytyped" %%% "domutils" % "3.0.1-18877a",
  "org.scalablytyped" %%% "htmlparser2" % "8.0.1-a26b20",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
