organization := "org.scalablytyped"
name := "hoxy"
version := "3.3-dt-20211202Z-f2161b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cheerio" % "1.0.0-rc.12-8b0473",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-c7805a",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-cd7455",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-e47de3",
  "org.scalablytyped" %%% "domutils" % "3.0.1-7bc680",
  "org.scalablytyped" %%% "htmlparser2" % "8.0.1-e0b66c",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
