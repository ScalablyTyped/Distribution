organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-580d01"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-d74533",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-facedf",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-723780",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-7c6e52",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-fc299e",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-f87cbc",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-257a4f",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6f6992",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-f5e499",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-dcf9e0",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-9a0613",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-42b281",
  "org.scalablytyped" %%% "source-map" % "0.7.3-9427ea",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-86c6de",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-594357",
  "org.scalablytyped" %%% "webpack" % "4.32-dt-20190724Z-8f1343",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20190624Z-8c1411",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-5ccc3f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        