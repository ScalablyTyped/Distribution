organization := "org.scalablytyped"
name := "hapi__yar"
version := "9.2-dt-20190425Z-07c89a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "9.0.0-e7b555",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-780401",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200115Z-e6a806",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-8e984c",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20200103Z-a322a6",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-044fa4",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-c6b525",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-34ab90",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-55b31a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        