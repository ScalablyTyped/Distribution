organization := "org.scalablytyped"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-23626b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-894834",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-b0b0d9",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-2677a7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-f02e41",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-a6e038",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-92e6db",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-1ddd6d",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-4a120b",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-647d39",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-76fdef",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-d3b7b2",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a681e2",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-ff537b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-a1ed43",
  "org.scalablytyped" %%% "source-map" % "0.7.3-e7ea21",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-3ef08e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        