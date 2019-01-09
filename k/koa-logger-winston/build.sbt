organization := "org.scalablytyped"
name := "koa-logger-winston"
version := "0.0-dt-20180703Z-2f8017"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-a76ae9",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181121Z-64ec94",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-07367a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-2e760b",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-174a7c",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-b9978d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-afbe4d",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-89a1a3",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-05cad5",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-92f676",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-a83ef9",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-1ca86a",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-0775ff",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b17d95",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-143c6f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-13d69c",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-67b6d7",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-0d1281",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-3abc85",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-645b7e",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-ca0ce5",
  "org.scalablytyped" %%% "winston" % "3.1.0-22d8af",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-a7c471")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        