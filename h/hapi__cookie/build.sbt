organization := "org.scalablytyped"
name := "hapi__cookie"
version := "10.1-dt-20190425Z-da8bec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-89bba0",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-d645f9",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190426Z-49cb47",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-02fbd7",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190425Z-d0129a",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-93c174",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-4c0b30",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-33e2a8",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-aa326f",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        