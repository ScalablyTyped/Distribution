organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-2eb5d3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-88ab74",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-4b6b4d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0aa3ae",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-17767a",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-fb147a",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-f9a52b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-a993f8",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-a9fbc4",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-d463b9",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-291dac",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-fcfde2",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-753dae",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-bad4a0",
  "org.scalablytyped" %%% "source-map" % "0.7.3-3d82c0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f8c6f2",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e5143c",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190411Z-0554c8",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-873b6c",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-fcff0e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        