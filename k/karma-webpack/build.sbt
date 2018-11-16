organization := "com.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20181102Z-6a341d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20181102Z-81c269",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20181102Z-6d07df",
  "com.scalablytyped" %%% "circular-json" % "0.4-dt-20181102Z-558bf7",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20181102Z-210269",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181102Z-fdaa94",
  "com.scalablytyped" %%% "karma" % "3.0-dt-20181102Z-f30efa",
  "com.scalablytyped" %%% "log4js" % "3.0.6-fa3eab",
  "com.scalablytyped" %%% "loglevel" % "1.5-dt-20181102Z-327f37",
  "com.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20181102Z-c2d9ee",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "source-map" % "0.7.3-771552",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20181102Z-d10221",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181102Z-f3dae8",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181116Z-80c872",
  "com.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20181102Z-74122c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        