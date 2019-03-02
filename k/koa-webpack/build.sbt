organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-1700ce"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e77a7c",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-ffeb0a",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-53a0b6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-d9104d",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-6d8584",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-7b5d5b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-15274d",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-840406",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-f7b0f5",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-db1914",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-d55fa8",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-346ddf",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-38db24",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1e193b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ae1f71",
  "org.scalablytyped" %%% "source-map" % "0.7.3-52dc03",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-4cd4ea",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ba58e2",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-5cab92",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-0b6ccd",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-07c8f8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        