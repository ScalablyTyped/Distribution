organization := "org.scalablytyped"
name := "koa-joi-router-docs"
version := "1.0-dt-20191104Z-bc23e7"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-87da9b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-95873a",
  "org.scalablytyped" %%% "co-body" % "0.0-unknown-dt-20190322Z-df652d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-21f8e2",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-91fe67",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-a64687",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-102985",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-07b0c9",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-ba4afa",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191107Z-059d4d",
  "org.scalablytyped" %%% "koa-joi-router" % "5.2-dt-20191107Z-692532",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20191016Z-faebed",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-e84c0f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20191107Z-37a656",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-c3e43f",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        