organization := "org.scalablytyped"
name := "handsontable"
version := "6.2.1-8a84aa"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bignumber_dot_js" % "8.0.1-b16164",
  "org.scalablytyped" %%% "moment" % "2.23.0-1a181b",
  "org.scalablytyped" %%% "numbro" % "2.1.1-36b493",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20181120Z-f5899f",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        