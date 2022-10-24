organization := "org.scalablytyped"
name := "html-to-pdfmake"
version := "2.1-dt-20220723Z-edebfd"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jsdom" % "20.0-dt-20220723Z-367ff7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "parse5" % "7.1.1-c1050b",
  "org.scalablytyped" %%% "pdfkit" % "v0.12.3-dt-20221016Z-43ed8a",
  "org.scalablytyped" %%% "pdfmake" % "0.2-dt-20220731Z-b9998f",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-337987")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
