organization := "org.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20181121Z-aee132"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bezier-js" % "0.0-unknown-dt-20181008Z-48383c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "opentype_dot_js" % "0.7-dt-20190104Z-c79173",
  "org.scalablytyped" %%% "pdfkit" % "v0.7.2-dt-20180214Z-d1b2a5",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        