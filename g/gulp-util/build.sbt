organization := "org.scalablytyped"
name := "gulp-util"
version := "3.0-dt-20180315Z-24da93"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-b48f67",
  "org.scalablytyped" %%% "chalk" % "2.4.2-953bc3",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-528543",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-86d5f2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-f611fa",
  "org.scalablytyped" %%% "through2" % "2.0-dt-20180906Z-7fdc70",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-53ab16")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        