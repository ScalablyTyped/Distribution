organization := "org.scalablytyped"
name := "koa-qs"
version := "2.0-dt-20181106Z-68b8d0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-8db10b",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-f180da",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d03b6a",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-63d9f9",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-d92710",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-4d11bc",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-ba4afa",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-b40dcb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-12c9b7",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-08e889",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-4ff83c",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        