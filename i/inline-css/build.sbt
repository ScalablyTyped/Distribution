organization := "org.scalablytyped"
name := "inline-css"
version := "3.0-dt-20211202Z-3ea991"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "cheerio" % "1.0.0-rc.12-8cd0bb",
  "org.scalablytyped" %%% "dom-serializer" % "2.0.0-9849a9",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-6dc867",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-2e8df9",
  "org.scalablytyped" %%% "domutils" % "3.0.1-95cfac",
  "org.scalablytyped" %%% "htmlparser2" % "8.0.1-addaf5",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
