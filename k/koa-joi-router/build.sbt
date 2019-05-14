organization := "org.scalablytyped"
name := "koa-joi-router"
version := "5.2-dt-20190423Z-9fab07"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-f78ffa",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-7d567c",
  "org.scalablytyped" %%% "co-body" % "0.0-unknown-dt-20190322Z-c5ff26",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-1fb804",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-a89b45",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-e5e43b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-6805e6",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-c4b8ce",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b7c6ed",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-a5cdeb",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-f5f2f9",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20190322Z-f1d78b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190513Z-e9c6e7",
  "org.scalablytyped" %%% "qs" % "6.5-dt-20190409Z-280945",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-68aadd",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        