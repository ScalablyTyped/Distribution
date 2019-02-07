organization := "org.scalablytyped"
name := "koa-joi-router"
version := "5.2-dt-20190205Z-8a480d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-437041",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-4e5340",
  "org.scalablytyped" %%% "co-body" % "0.0-unknown-dt-20180214Z-a8ca3b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-de8dcd",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-870885",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-f13538",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-cd7dc7",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-9dedb2",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190131Z-6a437a",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9719d3",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-b00293",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-83795e",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190122Z-2a685b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "qs" % "6.5.0-dt-20180214Z-e68ee6",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-4c4e34",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        