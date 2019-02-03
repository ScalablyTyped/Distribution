organization := "org.scalablytyped"
name := "koa-ratelimit"
version := "4.1-dt-20181217Z-08ad94"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-437041",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-4e5340",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-de8dcd",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-87ad60",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-ea3f90",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-cd7dc7",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-9dedb2",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9719d3",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-d73e36",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-83795e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-45605c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c7c39d",
  "org.scalablytyped" %%% "redis" % "2.8-dt-20181221Z-023a60",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-cb5d09",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        