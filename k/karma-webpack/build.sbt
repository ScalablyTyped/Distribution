organization := "org.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20180712Z-64d18b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-a09216",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-f01776",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-e6a834",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190129Z-0b8ca6",
  "org.scalablytyped" %%% "flatted" % "2.0.0-2feec5",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-9943d8",
  "org.scalablytyped" %%% "log4js" % "4.0.2-cdbff7",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-0b789a",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-ae8f80",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "source-map" % "0.7.3-cdf339",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-2fd0f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-876284",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-7fb977",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-fa5d5e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        