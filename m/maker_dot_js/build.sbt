organization := "com.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20181121Z-c2a578"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bezier-js" % "0.0-unknown-dt-20181009Z-4faa67",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "opentype_dot_js" % "0.7-dt-20180910Z-592c4c",
  "com.scalablytyped" %%% "pdfkit" % "v0.7.2-dt-20180910Z-c8288a",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        