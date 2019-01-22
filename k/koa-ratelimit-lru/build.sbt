organization := "org.scalablytyped"
name := "koa-ratelimit-lru"
version := "1.0-dt-20181116Z-d46437"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-5b430c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e9bff8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-014b69",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-d8af3e",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190108Z-fdb83d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-970fa5",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-8d272c",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1f56f8",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-582d71",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-38662f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-c3aa54",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        