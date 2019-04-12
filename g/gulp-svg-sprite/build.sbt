organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20190322Z-657699"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-7b85eb",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-1fcb89",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-54f634",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-dea611",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-30845c",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-cc6aa4",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20190322Z-ad49e2",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20190322Z-89e239",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-5108a8",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-94425c",
  "org.scalablytyped" %%% "winston" % "3.2.1-1a0af0",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-62bd3d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        