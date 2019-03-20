organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-1849da"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-979bd8",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2620c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ac6a7b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-9339aa",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-1ff155",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-6d51ab",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-0c8bec",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-07f032",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-96c7ba",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-3d92a5",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-2880d6",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-ba8ba9",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-3259f5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-2a152d",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-c57887",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ffccaa",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190316Z-c56cd1",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-01920b",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-3e5f27")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        