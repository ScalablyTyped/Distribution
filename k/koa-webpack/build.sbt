organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-a22d0a"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-f3acdc",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-a7db04",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-df943a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-9a5b07",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-4940ec",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-2563ef",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-c41353",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9360b6",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-0d114c",
  "org.scalablytyped" %%% "loglevel" % "1.6.3-42c31f",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20190322Z-6353bf",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190903Z-da4655",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-7db036",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-afc896",
  "org.scalablytyped" %%% "source-map" % "0.7.3-bb5048",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-230399",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e01dc2",
  "org.scalablytyped" %%% "webpack" % "4.39-dt-20190825Z-a23328",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "2.0-dt-20190624Z-be5e61",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.0-dt-20180621Z-21a699",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-8ac2b4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        