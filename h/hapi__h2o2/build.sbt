organization := "org.scalablytyped"
name := "hapi__h2o2"
version := "8.3-dt-20190425Z-916442"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190815Z-e580eb",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-055cd0",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190624Z-36c9d9",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-e1a78f",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190722Z-e2d216",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-915dfd",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-a4bd6d",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-ade070",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-2b791f",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-c250b3",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        