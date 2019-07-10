organization := "org.scalablytyped"
name := "hapi__vision"
version := "5.5-dt-20190412Z-be5972"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-bf35fc",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-6859ed",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190624Z-f561b8",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-38b99b",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190616Z-c2c8c3",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-168c47",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-950de7",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-e3ab5a",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-a40537",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190709Z-570c89",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        