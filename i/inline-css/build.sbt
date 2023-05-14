organization := "org.scalablytyped"
name := "inline-css"
version := "3.0-dt-20211202Z-0deb4e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cheerio" % "1.0.0-rc.12-0ba460",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-c75aa4",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-6dc867",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-24eaa1",
  "org.scalablytyped" %%% "domutils" % "3.1.0-4de6ef",
  "org.scalablytyped" %%% "htmlparser2" % "9.0.0-0ec163",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
