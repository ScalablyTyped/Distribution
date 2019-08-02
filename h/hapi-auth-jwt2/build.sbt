organization := "org.scalablytyped"
name := "hapi-auth-jwt2"
version := "8.6.1-664ca7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-6e17ff",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-a9414f",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190624Z-3d88a4",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-a96834",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190722Z-f97fcb",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-31dd4c",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-ee10bf",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-8d51e9",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20190304Z-940956",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-cb7ee4",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        