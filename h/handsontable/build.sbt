organization := "org.scalablytyped"
name := "handsontable"
version := "6.2.2-9afb6e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bignumber_dot_js" % "8.0.2-672dc5",
  "org.scalablytyped" %%% "moment" % "2.23.0-3073eb",
  "org.scalablytyped" %%% "numbro" % "2.1.2-c2a6e5",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20181116Z-3226da",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        