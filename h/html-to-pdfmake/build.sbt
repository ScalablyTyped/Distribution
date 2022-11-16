organization := "org.scalablytyped"
name := "html-to-pdfmake"
version := "2.1-dt-20220723Z-ff797b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jsdom" % "20.0-dt-20221107Z-5231d0",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "parse5" % "7.1.1-5d5867",
  "org.scalablytyped" %%% "pdfkit" % "v0.12.3-dt-20221029Z-903d1f",
  "org.scalablytyped" %%% "pdfmake" % "0.2-dt-20221108Z-1833ac",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-06bffe")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
