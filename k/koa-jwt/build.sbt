organization := "org.scalablytyped"
name := "koa-jwt"
version := "3.6.0-bbc228"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-c17a5d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-3cddfd",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-409dd3",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-f2c2c6",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-af9a1f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-cfcbef",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190925Z-059d36",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191015Z-4f243e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6388bc",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        