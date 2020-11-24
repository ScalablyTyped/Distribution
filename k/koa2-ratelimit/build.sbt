organization := "org.scalablytyped"
name := "koa2-ratelimit"
version := "0.9-dt-20201029Z-912188"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20200515Z-b22dfe",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20201028Z-8be3cf",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-7b4fa7",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20201020Z-739e4c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-931cf5",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200515Z-9f592d",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20201002Z-e51ad8",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20201028Z-b94300",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-c593b9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-c653a3",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20200515Z-dab14b",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20201020Z-da809b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20201105Z-6fba04",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-5d04c6",
  "org.scalablytyped" %%% "mongodb" % "3.5-dt-20201120Z-401478",
  "org.scalablytyped" %%% "mongoose" % "5.10.9-dt-20201117Z-575d8c",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-dccf4c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-1cff6e",
  "org.scalablytyped" %%% "redis" % "2.8-dt-20201013Z-580d3b",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20201002Z-3be1fe",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-237e1c",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "validator" % "13.1-dt-20200624Z-8d13b2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
