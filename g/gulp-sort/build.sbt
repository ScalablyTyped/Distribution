organization := "com.scalablytyped"
name := "gulp-sort"
version := "0.0-unknown-dt-20180910Z-619f95"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-16b038",
  "com.scalablytyped" %%% "chalk" % "2.4.1-ea2afe",
  "com.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-566c3e",
  "com.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-76e9e4",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "gulp-util" % "3.0-dt-20180910Z-252a4c",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-f11a37",
  "com.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-af3fca",
  "com.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-01cac1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        