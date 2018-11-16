organization := "com.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20181102Z-ae8350"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bezier-js" % "0.0-unknown-dt-20181102Z-f98e07",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "opentype_dot_js" % "0.7-dt-20181102Z-c0c7ee",
  "com.scalablytyped" %%% "pdfkit" % "v0.7.2-dt-20181102Z-91ee50",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        