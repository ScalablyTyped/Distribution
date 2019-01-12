organization := "org.scalablytyped"
name := "karma-webpack"
version := "2.0-dt-20180712Z-883181"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-09ec76",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20181213Z-6bd481",
  "org.scalablytyped" %%% "circular-json" % "0.4-dt-20180214Z-a61f17",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-7c4262",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-315ade",
  "org.scalablytyped" %%% "karma" % "3.0-dt-20181203Z-1da1b0",
  "org.scalablytyped" %%% "log4js" % "3.0.6-0f89a7",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180214Z-66e19c",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-76fdf2",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "source-map" % "0.7.3-238ef8",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-db8d14",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-11a316",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-930290",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-8bb23d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        