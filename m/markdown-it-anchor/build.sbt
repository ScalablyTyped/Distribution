organization := "com.scalablytyped"
name := "markdown-it-anchor"
version := "4.0-dt-20181102Z-c0c296"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "linkify-it" % "2.0.3-dt-20181102Z-792ca5",
  "com.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20181102Z-705c96",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        