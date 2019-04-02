organization := "org.scalablytyped"
name := "markdown-it-lazy-headers"
version := "0.13-dt-20181102Z-9444c5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190326Z-2ef30a",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190322Z-cee26a",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        