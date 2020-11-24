organization := "org.scalablytyped"
name := "hapi-auth-jwt2"
version := "10.2.0-34e4da"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-ea1163",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-5f8826",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20201028Z-828280",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-ca2847",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-b18c8d",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-b05588",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-d1ef9a",
  "org.scalablytyped" %%% "joi" % "17.3.0-423d65",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.5-dt-20200513Z-5237a0",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-a9d12a",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
