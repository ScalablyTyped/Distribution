organization := "org.scalablytyped"
name := "handsontable"
version := "6.2.2-a79c51"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bignumber_dot_js" % "8.1.1-86ca18",
  "org.scalablytyped" %%% "moment" % "2.24.0-77c476",
  "org.scalablytyped" %%% "numbro" % "2.1.2-4885c1",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20190224Z-dea457",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        