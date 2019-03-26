organization := "org.scalablytyped"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-41bba1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-470e7c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9f78fd",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-f1046e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-c85ddc",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-2999cc",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4576ab",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-506446",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-601c34",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-8d706b",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-f1722f",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-c93537",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-5b37e2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-03fba5",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d16283",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-201072",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-604ebf",
  "org.scalablytyped" %%% "source-map" % "0.7.3-aac742",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-5fcf02")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        