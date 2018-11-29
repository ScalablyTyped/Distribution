organization := "com.scalablytyped"
name := "koa-logger-winston"
version := "0.0-dt-20180910Z-119a3b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-f7a5e3",
  "com.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-4e17a5",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-bbb8a6",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-c1f383",
  "com.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-1de26b",
  "com.scalablytyped" %%% "express" % "4.16-dt-20180910Z-1b16d7",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-bec6af",
  "com.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-ac939d",
  "com.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-7e82fe",
  "com.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-3baf7b",
  "com.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-77c5a7",
  "com.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-ef7f7b",
  "com.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-c65ab9",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-c023cc",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-1bf893",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-953de2",
  "com.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-9bfd99",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-3c3247",
  "com.scalablytyped" %%% "winston" % "3.1.0-daf2a0",
  "com.scalablytyped" %%% "winston-transport" % "4.2.0-2eefbf",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        