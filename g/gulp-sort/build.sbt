organization := "org.scalablytyped"
name := "gulp-sort"
version := "0.0-unknown-dt-20180910Z-162ae3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181018Z-226182",
  "org.scalablytyped" %%% "chalk" % "2.4.1-c5701d",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180910Z-7f8b58",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180910Z-ca86dd",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20180910Z-262b43",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180910Z-7348e2",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180910Z-c75d0b",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-1dc2db")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        