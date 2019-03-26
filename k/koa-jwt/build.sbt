organization := "org.scalablytyped"
name := "koa-jwt"
version := "3.5.1-edb334"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-470e7c",
  "org.scalablytyped" %%% "aggregate-error" % "2.2.0-fa0cc2",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9f78fd",
  "org.scalablytyped" %%% "clean-stack" % "1.3-dt-20180214Z-8b7933",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-c85ddc",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-2999cc",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4576ab",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-506446",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-8d706b",
  "org.scalablytyped" %%% "indent-string" % "3.2-dt-20181210Z-7e2353",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-7d898d",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-f1722f",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-c93537",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-5b37e2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-03fba5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "p-any" % "2.0.0-265ad7",
  "org.scalablytyped" %%% "p-cancelable" % "1.1.0-f0fb96",
  "org.scalablytyped" %%% "p-some" % "4.0.0-8878c7",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d16283",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-604ebf",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "type-fest" % "0.1.0-f7c6c4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        