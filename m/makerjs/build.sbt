organization := "org.scalablytyped"
name := "makerjs"
version := "0.18.0-ef6b0c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "danmarshall__jscad-typings" % "1.0.0-21df10",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "opentype_dot_js" % "1.3-dt-20220812Z-d1150a",
  "org.scalablytyped" %%% "pdfkit" % "v0.12.3-dt-20230330Z-e3125c",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
