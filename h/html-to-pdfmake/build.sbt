organization := "org.scalablytyped"
name := "html-to-pdfmake"
version := "2.1-dt-20220723Z-e83fc9"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jsdom" % "20.0-dt-20220723Z-c38796",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "parse5" % "7.1.1-a2407e",
  "org.scalablytyped" %%% "pdfkit" % "v0.12.3-dt-20221016Z-3dbb58",
  "org.scalablytyped" %%% "pdfmake" % "0.2-dt-20220731Z-aaf8bd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-0fe4d5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
