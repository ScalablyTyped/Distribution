organization := "org.scalablytyped"
name := "koa-html-minifier"
version := "1.0-dt-20180823Z-95c322"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-3e6292",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-5329e6",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20200515Z-26912e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200515Z-4db3c4",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-bcd10f",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-b72608",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200515Z-9eb2b7",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200515Z-c2bfc2",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20200515Z-99b4b3",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-0ee69b",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200515Z-990721",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200515Z-593c89",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200519Z-7ad812",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-cd197c",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20200515Z-28c9d2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200519Z-9da187",
  "org.scalablytyped" %%% "source-map" % "0.7.3-f960ba",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "uglify-js" % "3.9-dt-20200519Z-c8112b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
