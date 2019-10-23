organization := "org.scalablytyped"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-ae17ff"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-5e503c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-d915df",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-82f4e8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-6c5fc3",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-17b25d",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-84e4a5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-847ee7",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-8c28ca",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191016Z-3de147",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191022Z-f18ffd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-707462",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-0ea21e",
  "org.scalablytyped" %%% "source-map" % "0.7.3-54a40f",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-2f0bcb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        