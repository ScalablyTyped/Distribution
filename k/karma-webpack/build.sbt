organization := "org.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20180712Z-616856"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-47e07f",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-8f594d",
  "org.scalablytyped" %%% "circular-json" % "0.4-dt-20180214Z-3ffab5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-38b4a6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-e4c78d",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-d1a4cb",
  "org.scalablytyped" %%% "log4js" % "3.0.6-9619cd",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180214Z-d484f8",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-7748b2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "source-map" % "0.7.3-242c07",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-48b551",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-603838",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-7f54f8",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-fe6f59")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        