organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20200122Z-27755d"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-31fe0d",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20200331Z-24a6d6",
  "org.scalablytyped" %%% "form-data" % "3.0.0-b3cc63",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-35a491",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-dc90bc",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200227Z-03184e",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-1ece61",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20200225Z-b5a4a3",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200330Z-2a1a5f",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20200225Z-e13790",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-c6dac4",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20190425Z-4e0939",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20200330Z-8b3e50",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-1ebdc6",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20200331Z-cf9c87")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
