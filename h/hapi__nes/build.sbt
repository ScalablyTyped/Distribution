organization := "org.scalablytyped"
name := "hapi__nes"
version := "11.0-dt-20190521Z-8e8ce6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-8b6118",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-d323cf",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190531Z-792805",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-065b41",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190425Z-0d5c13",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-b2e3fb",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-39e4fc",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-4c703c",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-96bb6c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        