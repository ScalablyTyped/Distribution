organization := "org.scalablytyped"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-29bfd1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-125faf",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-d89a50",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-7f60a2",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-ee50f3",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-5e3ca4",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-083460",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190717Z-df4cf9",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-8977ab",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6f6992",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-154b1e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-85a68c",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190717Z-f93e3e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-223eff",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-fa55c4",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-00865d",
  "org.scalablytyped" %%% "source-map" % "0.7.3-9427ea",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-594357")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        