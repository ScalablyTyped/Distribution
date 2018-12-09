organization := "org.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20181121Z-3aefc5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bezier-js" % "0.0-unknown-dt-20181009Z-7fef67",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "opentype_dot_js" % "0.7-dt-20180910Z-09f4a4",
  "org.scalablytyped" %%% "pdfkit" % "v0.7.2-dt-20180910Z-bb8057",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        