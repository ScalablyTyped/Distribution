organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-28f486"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-506444",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d73b57",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-81d3a1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-71585c",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-000b39",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-9e906b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-2595ac",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-e0a710",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-078299",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-591f4b",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-16c12d",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-2d8a55",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-226e2d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-aeafd9",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-8d0e0b",
  "org.scalablytyped" %%% "source-map" % "0.7.3-39089e",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-59c854",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-4f8c7c",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190222Z-8cc2d0",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-826577",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-0aa378")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        