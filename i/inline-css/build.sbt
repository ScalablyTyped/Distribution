organization := "org.scalablytyped"
name := "inline-css"
version := "3.0-dt-20211202Z-a3d1b0"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cheerio" % "1.0.0-rc.12-5306e5",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-b179d6",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-bb46e2",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-df5082",
  "org.scalablytyped" %%% "domutils" % "3.0.1-ea2eb8",
  "org.scalablytyped" %%% "htmlparser2" % "8.0.1-9ba008",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
