organization := "com.scalablytyped"
name := "koa2-session-redis"
version := "0.0-dt-20180910Z-07c9ca"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-f7a5e3",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-bbb8a6",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-c1f383",
  "com.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-1de26b",
  "com.scalablytyped" %%% "express" % "4.16-dt-20180910Z-1b16d7",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-bec6af",
  "com.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-ac939d",
  "com.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-3baf7b",
  "com.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-77c5a7",
  "com.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-ef7f7b",
  "com.scalablytyped" %%% "koa-session" % "5.7-dt-20180910Z-91ebb5",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-c023cc",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-1bf893",
  "com.scalablytyped" %%% "redis" % "2.8-dt-20181120Z-5ec415",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-953de2",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        