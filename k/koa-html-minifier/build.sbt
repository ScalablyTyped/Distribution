organization := "org.scalablytyped"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-f888b2"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-fe708f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-234f40",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-418c06",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8f9eda",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-a81a50",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-79dfe3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-3d1b1f",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-2eb757",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-2d2be7",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-21a720",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-8feecc",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6da2a4",
  "org.scalablytyped" %%% "source-map" % "0.7.3-20fa05",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a7321d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        