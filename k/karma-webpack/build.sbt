organization := "org.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20190212Z-5d6776"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-ffeb0a",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-cbbf17",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-d9104d",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-779d70",
  "org.scalablytyped" %%% "flatted" % "2.0.0-014468",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20190212Z-8efb3b",
  "org.scalablytyped" %%% "log4js" % "4.0.2-39e34b",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-346ddf",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-38db24",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "source-map" % "0.7.3-52dc03",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-4cd4ea",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ba58e2",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-5cab92",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-0b6ccd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        