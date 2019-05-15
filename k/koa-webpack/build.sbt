organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-807b05"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-94fd30",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c5c3e6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-1927bb",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a3203b",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-77f2c0",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-36041d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-59d609",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b7c6ed",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-330fcf",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-f5f2f9",
  "org.scalablytyped" %%% "loglevel" % "1.5-dt-20190205Z-de82c8",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-e2c3d2",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190514Z-07594f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-2d4b37",
  "org.scalablytyped" %%% "source-map" % "0.7.3-c62343",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-98777a",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-32bf87",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190506Z-fe1bcb",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20180709Z-4918ea",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-ed37e9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        