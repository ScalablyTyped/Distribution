organization := "org.scalablytyped"
name := "koa-router"
version := "v7.x-dt-20190122Z-9893b5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-433ad2",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-40b8d3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-50c57a",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-c1b534",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-42d72c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-ab47ea",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-9dedb2",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9719d3",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-cc13b6",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-4bd8b6",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-fa6869",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        