organization := "org.scalablytyped"
name := "hapi__bell"
version := "11.0-dt-20200925Z-e122de"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-015fca",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-9f5e62",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20201028Z-ed7e72",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-bda26a",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-292bbe",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-2b3679",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-75f810",
  "org.scalablytyped" %%% "joi" % "17.3.0-7ba32d",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-64e776",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
