organization := "com.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20180910Z-0444d0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-6ee76b",
  "com.scalablytyped" %%% "bluebird" % "3.5-dt-20180910Z-7bd99a",
  "com.scalablytyped" %%% "circular-json" % "0.4-dt-20180910Z-026cdb",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-b92a74",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e9dd4f",
  "com.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-5bf12f",
  "com.scalablytyped" %%% "log4js" % "3.0.6-9c892f",
  "com.scalablytyped" %%% "loglevel" % "1.5-dt-20180910Z-924ac0",
  "com.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180920Z-f4665f",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "source-map" % "0.7.3-ecab3d",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-ddeb4e",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-d28d6f",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181129Z-17ddae",
  "com.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180910Z-356772",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        