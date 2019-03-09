organization := "org.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20190212Z-415e4d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d73b57",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-865309",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-a449b6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-cd6676",
  "org.scalablytyped" %%% "flatted" % "2.0.0-a147dd",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20190212Z-beb86d",
  "org.scalablytyped" %%% "log4js" % "4.0.2-c9df6a",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-2d8a55",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-71771a",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "source-map" % "0.7.3-39089e",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-59c854",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-4f8c7c",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-4de36a",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-203142")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        