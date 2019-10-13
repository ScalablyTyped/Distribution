organization := "org.scalablytyped"
name := "hapi-pino"
version := "6.0-dt-20190701Z-a93e81"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190815Z-8d7495",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-5d686d",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190624Z-06165c",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-1cf369",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20191009Z-30eeb6",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-b7faec",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-39afd7",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-0ed218",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-7db5f5",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "pino" % "5.8-dt-20191010Z-4d41b1",
  "org.scalablytyped" %%% "pino-std-serializers" % "2.4-dt-20190701Z-f37042",
  "org.scalablytyped" %%% "sonic-boom" % "0.7-dt-20190819Z-4bee8b",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        