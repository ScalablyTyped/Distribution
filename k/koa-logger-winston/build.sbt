organization := "org.scalablytyped"
name := "koa-logger-winston"
version := "0.0-dt-20180703Z-a3788a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-c4b5f5",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-89bc8b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b38537",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-c7658c",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-8f46af",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-02bf23",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-7910af",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-8d272c",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-1e72c1",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1f56f8",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-cce8d4",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-38662f",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-845012",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-823163",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-78801a",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-ba3926",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-195cb6",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-111f11",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-ae8e92",
  "org.scalablytyped" %%% "winston" % "3.2.1-8c0e79",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-64d15f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        