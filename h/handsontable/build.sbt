organization := "org.scalablytyped"
name := "handsontable"
version := "6.2.0-ac88f5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bignumber_dot_js" % "8.0.1-358b35",
  "org.scalablytyped" %%% "moment" % "2.22.2-39aab6",
  "org.scalablytyped" %%% "numbro" % "2.1.1-d79ebb",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20181120Z-d41133",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        