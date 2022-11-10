organization := "org.scalablytyped"
name := "inline-css"
version := "3.0-dt-20211202Z-8127c8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cheerio" % "1.0.0-rc.12-864ac7",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-718d67",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-b522a9",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-79fef0",
  "org.scalablytyped" %%% "domutils" % "3.0.1-5cc61c",
  "org.scalablytyped" %%% "htmlparser2" % "8.0.1-a97cb8",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
