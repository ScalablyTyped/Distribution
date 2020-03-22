organization := "org.scalablytyped"
name := "hapi-auth-jwt2"
version := "9.0.1-e3cd82"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-42a2a0",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-3bb96a",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200227Z-2960a4",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-6b7807",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20200225Z-f77a38",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200225Z-0aa4d1",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20200225Z-739834",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-7c9b3e",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20200228Z-e351e9",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-574028",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
