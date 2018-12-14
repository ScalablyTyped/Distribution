organization := "org.scalablytyped"
name := "handsontable"
version := "6.2.1-6c52e8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bignumber_dot_js" % "8.0.1-7358d8",
  "org.scalablytyped" %%% "moment" % "2.23.0-39ab00",
  "org.scalablytyped" %%% "numbro" % "2.1.1-19121f",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20181120Z-778767",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        