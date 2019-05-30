organization := "org.scalablytyped"
name := "hapi__basic"
version := "5.1-dt-20190425Z-a2e11e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-bab83d",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-3f0197",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190426Z-6911a7",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-13fa97",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190425Z-722588",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-050514",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-e6baf8",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-87273e",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-2bedcf",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-2c614a",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        