organization := "org.scalablytyped"
name := "hapi-auth-jwt2"
version := "8.6.1-0b5454"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-bf35fc",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-6859ed",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190624Z-6ba1a2",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-4a48e4",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190616Z-c2c8c3",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-168c47",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-950de7",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-fcc0ad",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-646b3e",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-a40537",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        