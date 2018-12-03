organization := "com.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180910Z-c23f02"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-34187c",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-6ee76b",
  "com.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-6b0d80",
  "com.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-b92a74",
  "com.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-b6d66c",
  "com.scalablytyped" %%% "express" % "4.16-dt-20180910Z-b5e732",
  "com.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-5d5875",
  "com.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-ac939d",
  "com.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-3baf7b",
  "com.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-c6d029",
  "com.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-ef7f7b",
  "com.scalablytyped" %%% "loglevel" % "1.5-dt-20180910Z-924ac0",
  "com.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180920Z-f4665f",
  "com.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-c023cc",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "range-parser" % "1.2-dt-20180910Z-1bf893",
  "com.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-9a9ab6",
  "com.scalablytyped" %%% "source-map" % "0.7.3-ecab3d",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-ddeb4e",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-d28d6f",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181129Z-17ddae",
  "com.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180910Z-356772",
  "com.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180910Z-7d5057",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        