organization := "org.scalablytyped"
name := "hoxy"
version := "3.3-dt-20211202Z-c6cb0c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cheerio" % "1.0.0-rc.12-02f0ff",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-c75aa4",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-6dc867",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-24eaa1",
  "org.scalablytyped" %%% "domutils" % "3.1.0-4de6ef",
  "org.scalablytyped" %%% "htmlparser2" % "9.0.0-420692",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
