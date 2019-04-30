organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-063f79"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e91840",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-4b6b4d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-2ffec6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-44a2a2",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-395bf5",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-f548c5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-a197d0",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-a9fbc4",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-507cc1",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-291dac",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-fcfde2",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-bd95b0",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-c951c0",
  "org.scalablytyped" %%% "source-map" % "0.7.3-3d82c0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f8c6f2",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e5143c",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190428Z-986312",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-42d15f",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-525d74")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        