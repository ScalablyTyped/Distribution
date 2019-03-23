organization := "org.scalablytyped"
name := "markdown-it-lazy-headers"
version := "0.13-dt-20181102Z-9af759"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "linkify-it" % "2.1.0-dt-20190312Z-c708dd",
  "org.scalablytyped" %%% "markdown-it" % "0.0-unknown-dt-20190322Z-fac0d4",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        