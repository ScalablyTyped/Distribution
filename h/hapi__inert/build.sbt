organization := "org.scalablytyped"
name := "hapi__inert"
version := "5.2-dt-20190412Z-43796c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-9c1cb7",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190404Z-33458b",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190426Z-79e779",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-a794f5",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190425Z-fb345a",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-e90234",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-18630a",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-73909b",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-279468",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-cb8223",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        