organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-c5f5fd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-5804a4",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-6f800f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-a8ed72",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-6a8dc8",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-897588",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-14c66e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-d8c77b",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-0cd2ad",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-cf9c5c",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-444d6e",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-2b27d0",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-e91d7c",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-141f6f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-4ceb07",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1b6210",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-20a77d",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-c8c046",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190403Z-d52c00",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-820d74",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-09a0d1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        