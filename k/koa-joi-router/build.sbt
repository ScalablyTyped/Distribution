organization := "org.scalablytyped"
name := "koa-joi-router"
version := "5.2-dt-20190209Z-4ca279"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e77a7c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-53a0b6",
  "org.scalablytyped" %%% "co-body" % "0.0-unknown-dt-20180214Z-94c67c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-d9104d",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-6d8584",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-7b5d5b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-15274d",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-840406",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-d23d37",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-f7b0f5",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-db1914",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-d55fa8",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190223Z-5a1faf",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "qs" % "6.5.0-dt-20190228Z-17753a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1e193b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ae1f71",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        