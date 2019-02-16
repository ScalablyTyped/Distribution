organization := "org.scalablytyped"
name := "koa-jwt"
version := "3.5.1-73dba6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-4ae034",
  "org.scalablytyped" %%% "aggregate-error" % "1.0-dt-20180214Z-17440b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-18f5bb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-9d0391",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-a085ef",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-ac6847",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-5bd5ac",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-9dedb2",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20181101Z-400a14",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9719d3",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-f7ac08",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-4bd8b6",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "p-any" % "1.1-dt-20180214Z-8b92e7",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ffe082",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        