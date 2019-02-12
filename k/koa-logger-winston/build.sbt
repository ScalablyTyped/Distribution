organization := "org.scalablytyped"
name := "koa-logger-winston"
version := "0.0-dt-20180703Z-77577a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-5f198b",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-ca81e9",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-322647",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-fba25e",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-fc2db3",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-aabd2b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-f1d2dc",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-9dedb2",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-c0051e",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9719d3",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-939f92",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-4bd8b6",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-640fda",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-d1795e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-2e0f1a",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-97c4bb",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-308d11",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-2f7239",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-becbe4",
  "org.scalablytyped" %%% "winston" % "3.2.1-e62e3f",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-32b613")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        