organization := "org.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20190212Z-cda8c9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-6f800f",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190225Z-986805",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-53c35c",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "flatted" % "2.0.0-5cf2f6",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20190212Z-ec6767",
  "org.scalablytyped" %%% "log4js" % "4.1.0-7f01c4",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-e91d7c",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-dc0c28",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1b6210",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-20a77d",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-c8c046",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190316Z-c230d0",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-78faa6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        