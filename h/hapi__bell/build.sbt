organization := "org.scalablytyped"
name := "hapi__bell"
version := "11.0-dt-20190916Z-ce0742"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190815Z-8d7495",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-5d686d",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190624Z-cb2b18",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-3072e5",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20191009Z-30eeb6",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-b7faec",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-39afd7",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-fc9153",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-7db5f5",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191021Z-a8dc6e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        