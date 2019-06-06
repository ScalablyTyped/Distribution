organization := "org.scalablytyped"
name := "koa-logger"
version := "3.1-dt-20181009Z-299920"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-a31aa8",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cc8509",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a0bc27",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-0a5d55",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-d1c3bf",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-712af1",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-b91680",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190322Z-ab4a99",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-e38788",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-49fefe",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190605Z-895d8c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-374f35",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-ed9c04",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        