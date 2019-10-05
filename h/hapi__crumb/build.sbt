organization := "org.scalablytyped"
name := "hapi__crumb"
version := "7.3-dt-20190425Z-5432d0"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190815Z-740ca8",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-c5f942",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190624Z-dbe2df",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-485d23",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190903Z-2cda73",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-211be5",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-c2637a",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-f6a2d0",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-076342",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-a35ed6",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        