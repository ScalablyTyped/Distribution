organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-872775"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-c4b5f5",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-3be82b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-b38537",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-c7658c",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-8f46af",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-02bf23",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-7910af",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-8d272c",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1f56f8",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-cce8d4",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-38662f",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180214Z-48de0b",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-9ce2c7",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-195cb6",
  "org.scalablytyped" %%% "source-map" % "0.7.3-1d8315",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-1d4d44",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-280313",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-40f11b",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-0cd77d",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-ad4f64")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        