organization := "com.scalablytyped"
name := "handsontable"
version := "6.1.1-695800"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bignumber_dot_js" % "8.0.1-b9de0d",
  "com.scalablytyped" %%% "moment" % "2.22.2-e2e353",
  "com.scalablytyped" %%% "numbro" % "2.1.1-7866e3",
  "com.scalablytyped" %%% "pikaday" % "1.7-dt-20181102Z-5481ce",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        