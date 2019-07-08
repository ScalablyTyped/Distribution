organization := "org.scalablytyped"
name := "koa-redis-cache"
version := "3.0-dt-20180812Z-d0249a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-81e1d4",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-192d3d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-042dbc",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-24452b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-64fa08",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-c03427",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-271e7b",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-3b34b7",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-1188af",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1c84be",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f16918",
  "org.scalablytyped" %%% "redis" % "2.8-dt-20190528Z-bdd82f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d6a4d1",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        