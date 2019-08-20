organization := "org.scalablytyped"
name := "koa-pino-logger"
version := "2.1-dt-20190816Z-f0c1bc"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-ae4183",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-0f462b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8e708a",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-2d0e0d",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-381ce5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-aba9aa",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-2d2be7",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-8c12f5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20190816Z-0d9374",
  "org.scalablytyped" %%% "pino-http" % "4.0-dt-20190816Z-5ebc42",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-e15946",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-c4d375",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-676f42",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        