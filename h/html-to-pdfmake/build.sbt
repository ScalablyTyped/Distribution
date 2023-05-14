organization := "org.scalablytyped"
name := "html-to-pdfmake"
version := "2.4-dt-20230506Z-5c140f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "jsdom" % "21.1-dt-20230322Z-c123e3",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "parse5" % "7.1.2-b99116",
  "org.scalablytyped" %%% "pdfkit" % "v0.12.3-dt-20230330Z-84b51b",
  "org.scalablytyped" %%% "pdfmake" % "0.2-dt-20230413Z-e9c039",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-1da94b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
