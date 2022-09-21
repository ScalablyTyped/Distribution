organization := "org.scalablytyped"
name := "inline-css"
version := "3.0-dt-20211202Z-c6e7f9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cheerio" % "1.0.0-rc.12-707d31",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-f77ebd",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-bb46e2",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-1e6ffc",
  "org.scalablytyped" %%% "domutils" % "3.0.1-f75e84",
  "org.scalablytyped" %%% "htmlparser2" % "8.0.1-f90e7e",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
