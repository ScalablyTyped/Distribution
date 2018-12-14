organization := "org.scalablytyped"
name := "koa-logger-winston"
version := "0.0-dt-20180910Z-b3ef14"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-43d569",
  "org.scalablytyped" %%% "async" % "2.0.1-dt-20181020Z-6d9978",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-984ce4",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-3335a7",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-3da929",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-420192",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-ec2aeb",
  "org.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-f2e347",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180910Z-6472ea",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-c19616",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-3bb500",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-96bbad",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180910Z-3326eb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-08f14a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-85fa0c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-06fcdd",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180910Z-dfb439",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180910Z-c053bc",
  "org.scalablytyped" %%% "winston" % "3.1.0-239e18",
  "org.scalablytyped" %%% "winston-transport" % "4.2.0-d02ffa")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        