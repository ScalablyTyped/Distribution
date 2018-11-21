organization := "com.scalablytyped"
name := "handsontable"
version := "6.1.0-c2497a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bignumber_dot_js" % "7.2.1-82190d",
  "com.scalablytyped" %%% "moment" % "2.22.2-b3769a",
  "com.scalablytyped" %%% "numbro" % "2.1.1-845749",
  "com.scalablytyped" %%% "pikaday" % "1.7-dt-20181120Z-802395",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        