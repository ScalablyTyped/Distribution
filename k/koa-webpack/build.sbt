organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-307220"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-437041",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-a09216",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-4e5340",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-de8dcd",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-87ad60",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-ea3f90",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-cd7dc7",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-9dedb2",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9719d3",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-d73e36",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-83795e",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180214Z-d32cc8",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-8e2409",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-45605c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-cb5d09",
  "org.scalablytyped" %%% "source-map" % "0.7.3-cdf339",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-2fd0f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-876284",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-eb67c5",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-c87902",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-37fa5b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        