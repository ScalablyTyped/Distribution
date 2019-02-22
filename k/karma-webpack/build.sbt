organization := "org.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20190212Z-2c73fe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-a09216",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20190221Z-f01776",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-50c57a",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-c0f3d2",
  "org.scalablytyped" %%% "flatted" % "2.0.0-2feec5",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20190212Z-c94977",
  "org.scalablytyped" %%% "log4js" % "4.0.2-b7254e",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-0b789a",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-388b98",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "source-map" % "0.7.3-cdf339",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-2fd0f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-876284",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-a3b5cc",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-add0c3")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        