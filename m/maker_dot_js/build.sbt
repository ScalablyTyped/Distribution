organization := "org.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20201002Z-9a938c"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "opentype_dot_js" % "1.3-dt-20200908Z-2ade4a",
  "org.scalablytyped" %%% "pdfkit" % "v0.10.0-dt-20201002Z-b4f413",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
