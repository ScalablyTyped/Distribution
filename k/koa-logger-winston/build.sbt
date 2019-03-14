organization := "org.scalablytyped"
name := "koa-logger-winston"
version := "0.0-dt-20180703Z-ba522c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-b7228a",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-21c6be",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-c5c4e3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fd1784",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-d71e62",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-68b458",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-02a1c5",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-07f032",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-3ddf22",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-96c7ba",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-61ce53",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-2880d6",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-4841be",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-6dcdf6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-ddee67",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-2fa149",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-b44a76",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-8bbfec",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-c1833f",
  "org.scalablytyped" %%% "winston" % "3.2.1-dff84b",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-90302d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        