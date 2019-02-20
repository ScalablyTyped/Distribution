organization := "org.scalablytyped"
name := "gulp-cache"
version := "v0.4.5-dt-20180214Z-68eda7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-a737ef",
  "org.scalablytyped" %%% "chalk" % "2.4.2-413387",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-048d4d",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-964066",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20180315Z-e4f719",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-20da60",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-67b0d9",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-a58d53")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        