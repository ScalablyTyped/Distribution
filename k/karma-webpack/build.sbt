organization := "org.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20180910Z-6afa27"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-5af0d9",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-98d464",
  "org.scalablytyped" %%% "circular-json" % "0.4-dt-20180910Z-45b164",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-95bd8f",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-42ca48",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-5cfafb",
  "org.scalablytyped" %%% "log4js" % "3.0.6-7e5dfe",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180910Z-15ef59",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180920Z-5a6502",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4f6afc",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-9fb0f3",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-ca77c5",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181129Z-961fa8",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180910Z-da52bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        