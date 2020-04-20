organization := "org.scalablytyped"
name := "hapi__cookie"
version := "10.1-dt-20190425Z-984e60"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-35a491",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-dc90bc",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200227Z-03184e",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-1ece61",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20200225Z-b5a4a3",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200330Z-2a1a5f",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20200225Z-e13790",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-c6dac4",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20200330Z-8b3e50",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
