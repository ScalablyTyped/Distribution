organization := "org.scalablytyped"
name := "koa-logger-winston"
version := "0.0-dt-20180703Z-733048"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-470e7c",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-3aa38d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9f78fd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-c85ddc",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-2999cc",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4576ab",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-506446",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-8d706b",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-186c43",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-f1722f",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-c93537",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-5b37e2",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-e63111",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-03fba5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-2f4f37",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d16283",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-889e65",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-1895d1",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-604ebf",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20190322Z-44140b",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-609cba",
  "org.scalablytyped" %%% "winston" % "3.2.1-061747",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-d43c80")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        