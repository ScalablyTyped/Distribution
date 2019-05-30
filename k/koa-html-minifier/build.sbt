organization := "org.scalablytyped"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-eaebcd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-72fa28",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-7dd9f0",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-80f68b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-819901",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-56ed5b",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-db9911",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-6f5f9b",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-143a5e",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b91680",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-d7855d",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-e38788",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-2c614a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-3cc072",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-8d69c1",
  "org.scalablytyped" %%% "source-map" % "0.7.3-04ee27",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-a1762e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        