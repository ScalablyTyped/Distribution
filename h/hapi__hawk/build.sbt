organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20200925Z-008383"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-911575",
  "org.scalablytyped" %%% "crypto-js" % "v4.0.0-dt-20201006Z-70ff51",
  "org.scalablytyped" %%% "form-data" % "3.0.0-8c69ed",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-ea1163",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-5f8826",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20201028Z-828280",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-ca2847",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-b18c8d",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-b05588",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-d1ef9a",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20200925Z-30c589",
  "org.scalablytyped" %%% "joi" % "17.3.0-423d65",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-a9d12a",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-989d2d",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-f8d115")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
