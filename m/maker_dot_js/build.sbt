organization := "com.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20180910Z-e333ab"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bezier-js" % "0.0-unknown-dt-20181009Z-c2b9a9",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "opentype_dot_js" % "0.7-dt-20180910Z-0a5d4a",
  "com.scalablytyped" %%% "pdfkit" % "v0.7.2-dt-20180910Z-07b893",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        