organization := "org.scalablytyped"
name := "koa-route"
version := "3.2-dt-20180625Z-094b4e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-461451",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9c0b17",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-4db962",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-35ffc4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-dbaceb",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-e06e47",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-271e7b",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-2a0caf",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-1188af",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1c84be",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "path-to-regexp" % "3.0.0-45a0e4",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f16918",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-5d9695",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        