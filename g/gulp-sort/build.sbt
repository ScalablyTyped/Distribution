organization := "org.scalablytyped"
name := "gulp-sort"
version := "0.0-unknown-dt-20190322Z-1b5652"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20190322Z-749fa6",
  "org.scalablytyped" %%% "chalk" % "2.4.2-3344ae",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20190212Z-7e7317",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20190322Z-0fc5fc",
  "org.scalablytyped" %%% "gulp-util" % "3.0-dt-20180315Z-276598",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-b01a75",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20190322Z-15c8b6",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-80129d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        