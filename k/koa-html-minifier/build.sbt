organization := "org.scalablytyped"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-d91664"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-5804a4",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-a8ed72",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-1a2d77",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-6a8dc8",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-897588",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-14c66e",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-d8c77b",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-aca31b",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-0cd2ad",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-cf9c5c",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-444d6e",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-2b27d0",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-4218fa",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-4ceb07",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1b6210",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-c8c046")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        