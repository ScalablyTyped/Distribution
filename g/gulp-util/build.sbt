organization := "org.scalablytyped"
name := "gulp-util"
version := "3.0-dt-20180910Z-5e586d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-9d8946",
  "org.scalablytyped" %%% "chalk" % "2.4.1-d31457",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-1e18f5",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-895ba8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-e87018",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-d3b4a6",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-520850")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        