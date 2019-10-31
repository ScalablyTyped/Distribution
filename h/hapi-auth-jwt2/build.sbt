organization := "org.scalablytyped"
name := "hapi-auth-jwt2"
version := "8.8.0-74a9a0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190815Z-8d7495",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-5d686d",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190624Z-83f4bf",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-0d3d5e",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20191022Z-36e24a",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-b7faec",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-39afd7",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-cbfdb6",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20191015Z-b0ba63",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-7db5f5",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        