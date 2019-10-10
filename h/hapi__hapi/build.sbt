organization := "org.scalablytyped"
name := "hapi__hapi"
version := "18.2-dt-20190624Z-1f9248"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190815Z-740ca8",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-c5f942",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-a2ec35",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20191009Z-51a796",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-211be5",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-c2637a",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-0a7a55",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-076342",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        