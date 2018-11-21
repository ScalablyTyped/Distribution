organization := "com.scalablytyped"
name := "markdown-it-lazy-headers"
version := "0.13-dt-20181104Z-e54bac"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "linkify-it" % "2.0.3-dt-20181018Z-8e65aa",
  "com.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20181104Z-ea2bdb",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        