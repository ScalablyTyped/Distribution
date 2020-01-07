organization := "org.scalablytyped"
name := "koa-joi-router-docs"
version := "1.0-dt-20191104Z-dc9d28"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-374f13",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-ea079a",
  "org.scalablytyped" %%% "co-body" % "0.0-unknown-dt-20190322Z-b303da",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-224a28",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-b3ee10",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-2df7b1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-488272",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-71d4bf",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-e35051",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-e1812a",
  "org.scalablytyped" %%% "koa-joi-router" % "5.2-dt-20191107Z-a10a4b",
  "org.scalablytyped" %%% "koa-router" % "v7.x-dt-20191016Z-a13bcb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e32d86",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20191107Z-ce98fe",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-166e61",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-ba7911",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        