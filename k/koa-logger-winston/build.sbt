organization := "org.scalablytyped"
name := "koa-logger-winston"
version := "0.0-dt-20180703Z-4fb1af"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-cbfc67",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-1551fb",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-756d43",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-7c4262",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-f565c6",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-8f4d08",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-af1292",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-18ffc1",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-932536",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-43067a",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-51f4a6",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-7f96e5",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-89d9fa",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-6294fd",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-a3f667",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d115b2",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-3ad3b2",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-3095ce",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-91019c",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-a6750d",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-e2d980",
  "org.scalablytyped" %%% "winston" % "3.1.0-d330bb",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-b7b3a7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        