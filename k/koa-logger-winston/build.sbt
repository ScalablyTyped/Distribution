organization := "org.scalablytyped"
name := "koa-logger-winston"
version := "0.0-dt-20180703Z-5db4e6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-506444",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-85e9e1",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-81d3a1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-71585c",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-000b39",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-9e906b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-2595ac",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-e0a710",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-da6376",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-078299",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-591f4b",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-16c12d",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-4e8c11",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-34fdd0",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-aeafd9",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-935d9f",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-0a9f78",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-8d0e0b",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-c8ed4c",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-bcda47",
  "org.scalablytyped" %%% "winston" % "3.2.1-0522bb",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-ee24cd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        