organization := "org.scalablytyped"
name := "koa-pino-logger"
version := "2.1-dt-20181012Z-f34d84"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-208775",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e65c03",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-38b4a6",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-a1165f",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-05cc5e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-776b92",
  "org.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-341460",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-ef7ada",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181106Z-d33f50",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-2abf67",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b650df",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20181128Z-d1041d",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-ef877c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-f8f5d7",
  "org.scalablytyped" %%% "sonic-boom" % "0.6-dt-20181105Z-9a4308",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        