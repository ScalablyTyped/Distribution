organization := "org.scalablytyped"
name := "html-to-pdfmake"
version := "2.1-dt-20220723Z-8d7372"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jsdom" % "20.0-dt-20220723Z-955a8d",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "parse5" % "7.1.1-96513d",
  "org.scalablytyped" %%% "pdfkit" % "v0.12.3-dt-20220818Z-22574b",
  "org.scalablytyped" %%% "pdfmake" % "0.2-dt-20220731Z-7ac572",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-95204d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
