organization := "org.scalablytyped"
name := "html-react-parser"
version := "3.0.4-af78ed"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-b179d6",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-bb46e2",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-df5082",
  "org.scalablytyped" %%% "domutils" % "3.0.1-ea2eb8",
  "org.scalablytyped" %%% "htmlparser2" % "8.0.1-9ba008",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
