organization := "org.scalablytyped"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-64eff0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e3acbb",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-56ad56",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-cd9d17",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a597fb",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-6e9d70",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-5ac7c3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-99402a",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-b10fa0",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b7c6ed",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-527b16",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-f5f2f9",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-0fc3e5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-94d189",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c62343",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-32bf87")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        