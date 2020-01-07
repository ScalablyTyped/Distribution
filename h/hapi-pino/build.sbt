organization := "org.scalablytyped"
name := "hapi-pino"
version := "6.3-dt-20191022Z-874d3f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190815Z-181f0c",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-780401",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20191105Z-c4a4fb",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-0551bd",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20200103Z-a322a6",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-044fa4",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-c6b525",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-f806d7",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-55b31a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "pino" % "5.15-dt-20191223Z-810908",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-464673",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-8372b1",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        