organization := "org.scalablytyped"
name := "makerjs"
version := "0.17.1-2b2a78"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "danmarshall__jscad-typings" % "1.0.0-8ad606",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "opentype_dot_js" % "1.3-dt-20220812Z-3011ec",
  "org.scalablytyped" %%% "pdfkit" % "v0.12.3-dt-20221029Z-b7456b",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
