organization := "org.scalablytyped"
name := "hapi__nes"
version := "11.0-dt-20191126Z-6ece01"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190815Z-709df8",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-8f36e3",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20191105Z-77fee6",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-938eba",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20191227Z-9ffaf4",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-f46148",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-1a0bd3",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-3c649e",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-a6d597",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        