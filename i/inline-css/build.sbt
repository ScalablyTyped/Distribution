organization := "org.scalablytyped"
name := "inline-css"
version := "3.0-dt-20211202Z-e3c2bb"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cheerio" % "1.0.0-rc.12-9bcc72",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-d36eb3",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-424ef8",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-0ed4b9",
  "org.scalablytyped" %%% "domutils" % "3.0.1-18877a",
  "org.scalablytyped" %%% "htmlparser2" % "8.0.1-a26b20",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
