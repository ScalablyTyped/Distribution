organization := "org.scalablytyped"
name := "hapi__hapi"
version := "18.2-dt-20190624Z-cff30b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190815Z-8d7495",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-5d686d",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-1da906",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20191022Z-36e24a",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-b7faec",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-39afd7",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-56e12e",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-7db5f5",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191023Z-ebe9d8",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        