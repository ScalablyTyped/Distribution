organization := "org.scalablytyped"
name := "koa-pino-logger"
version := "2.1-dt-20190816Z-ef19c9"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-87da9b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-95873a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-21f8e2",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-91fe67",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-a64687",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-102985",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-ba4afa",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191107Z-059d4d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-e84c0f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20191028Z-f33820",
  "org.scalablytyped" %%% "pino-http" % "4.3-dt-20191003Z-57627e",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-a05dd9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-c3e43f",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-66b912",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        