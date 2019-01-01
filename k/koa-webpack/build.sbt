organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-f06384"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e4d2c7",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-e20eff",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ff0790",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-20e594",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-0b5865",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-b45157",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-e60b5f",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-0ee7fc",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-905984",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-5dcdb2",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-852c3d",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20180214Z-a907ed",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20180919Z-bb8d43",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b5dce1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5932ee",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-d30fee",
  "org.scalablytyped" %%% "source-map" % "0.7.3-fc8207",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-48ad47",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-8b616d",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-bcc5d7",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-763944",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-62a036")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        