organization := "org.scalablytyped"
name := "makerjs"
version := "0.17.1-5a4a48"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "danmarshall__jscad-typings" % "1.0.0-c6749b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "opentype_dot_js" % "1.3-dt-20220812Z-c2ac4b",
  "org.scalablytyped" %%% "pdfkit" % "v0.12.3-dt-20221016Z-b2d299",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
