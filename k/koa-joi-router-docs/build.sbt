organization := "org.scalablytyped"
name := "koa-joi-router-docs"
version := "1.0-dt-20191104Z-6a4c8d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-6c56fa",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-c42858",
  "org.scalablytyped" %%% "co-body" % "0.0-unknown-dt-20190322Z-5630be",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-058a79",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-55299d",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-641541",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200121Z-e6811a",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-0b3433",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-c8bdc7",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200211Z-a5bb51",
  "org.scalablytyped" %%% "koa-joi-router" % "5.2-dt-20191107Z-cea500",
  "org.scalablytyped" %%% "koa-router" % "7.4-dt-20200109Z-76a1bb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200207Z-e66ac9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-28020e",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
