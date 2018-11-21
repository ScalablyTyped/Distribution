organization := "com.scalablytyped"
name := "koa-etag"
version := "3.0-dt-20180910Z-56f013"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-ec3510",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-6ca2c5",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-feceb2",
  "com.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-d3b0bd",
  "com.scalablytyped" %%% "etag" % "1.8-dt-20180910Z-81275f",
  "com.scalablytyped" %%% "express" % "4.16-dt-20180910Z-4d8764",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-43b19a",
  "com.scalablytyped" %%% "http-assert" % "1.3-dt-20180910Z-641cf1",
  "com.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-c9489d",
  "com.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-a9709f",
  "com.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-fc463f",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-f9ab87",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-dfa7aa",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-5d47cf",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        