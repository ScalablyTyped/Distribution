organization := "org.scalablytyped"
name := "graphql-upload"
version := "8.0-dt-20190826Z-030f1f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-7f0c3e",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-675d96",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-1971cc",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-65d47f",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-df008a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191101Z-cdc4d1",
  "org.scalablytyped" %%% "fs-capacitor" % "2.0-dt-20190509Z-a75c1f",
  "org.scalablytyped" %%% "graphql" % "14.5.8-bafd12",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-215745",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191107Z-0899ea",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191108Z-6cbaae",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-1c7f66",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        