organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-792042"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-b3e120",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d4520c",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-f1cf1e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-0a9c38",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-1e22ed",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-b0737f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-941e8c",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-e35051",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-9993df",
  "org.scalablytyped" %%% "loglevel" % "1.6.6-128067",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20191126Z-126193",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e32d86",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-166e61",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-949d85",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-beaace",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f4c7eb",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200111Z-18f558",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-0ca3a8",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200107Z-c88c35",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20190624Z-8e6bfa",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-9a3a87",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-d3d687")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        