organization := "org.scalablytyped"
name := "hapi__glue"
version := "6.1-dt-20190425Z-a80946"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190815Z-7cd19f",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-5298be",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20191105Z-bd784d",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-4b30ca",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20191104Z-234a44",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-3c3630",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-d0ccde",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-6d0a11",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-25897f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        