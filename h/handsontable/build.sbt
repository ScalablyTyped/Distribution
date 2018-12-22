organization := "org.scalablytyped"
name := "handsontable"
version := "6.2.2-f58107"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bignumber_dot_js" % "8.0.1-142403",
  "org.scalablytyped" %%% "moment" % "2.23.0-f391bb",
  "org.scalablytyped" %%% "numbro" % "2.1.1-4a8040",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20181116Z-8b069e",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        