organization := "org.scalablytyped"
name := "koa-joi-router"
version := "5.2-dt-20190423Z-1822e5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-7b6f78",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-912347",
  "org.scalablytyped" %%% "co-body" % "0.0-unknown-dt-20190322Z-f59a59",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-183255",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-447551",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-900bce",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-04f31e",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-c14a93",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191016Z-686200",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20191016Z-ff788d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "qs" % "6.5-dt-20190409Z-01d7b9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6a27ff",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        