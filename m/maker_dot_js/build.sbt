organization := "org.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20201002Z-ed2247"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "opentype_dot_js" % "1.3-dt-20200908Z-ecdc2e",
  "org.scalablytyped" %%% "pdfkit" % "v0.10.0-dt-20201002Z-8b2058",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
