organization := "org.scalablytyped"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-7f737a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-1fdfc6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-a83d81",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-5a0c61",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-e438a4",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-aba9d8",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-e44937",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-a3652a",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-fe4a5f",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190925Z-00121b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-707462",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-84f8ef",
  "org.scalablytyped" %%% "source-map" % "0.7.3-54a40f",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-2f0bcb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        