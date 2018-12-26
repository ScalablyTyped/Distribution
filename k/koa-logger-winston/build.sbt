organization := "org.scalablytyped"
name := "koa-logger-winston"
version := "0.0-dt-20180703Z-4a5c3f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-208775",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-7389a9",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e65c03",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-38b4a6",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-a1165f",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-05cc5e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-776b92",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-10ee03",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-2b8873",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-ef7ada",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181106Z-dd5f7e",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-2abf67",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-1dd23a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b650df",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-ef877c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-f8f5d7",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-0bd5f5",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-ca97c1",
  "org.scalablytyped" %%% "winston" % "3.1.0-cbac64",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-ca0971")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        