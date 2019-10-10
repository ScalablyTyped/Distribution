organization := "org.scalablytyped"
name := "kue"
version := "0.11.x-dt-20190819Z-2f21eb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-aabbef",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-db6ee1",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-3b7640",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-dff786",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51ab0c",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0d10b5",
  "org.scalablytyped" %%% "redis" % "2.8-dt-20190926Z-9b2895",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-e134e0",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        