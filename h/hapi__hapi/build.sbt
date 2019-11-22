organization := "org.scalablytyped"
name := "hapi__hapi"
version := "18.2-dt-20191105Z-d92ea8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190815Z-e49b03",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-74d1e7",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-87b78d",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20191104Z-570e69",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-f69d9c",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-44a969",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-128edf",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-c223ab",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        