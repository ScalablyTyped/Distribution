organization := "org.scalablytyped"
name := "hapi__basic"
version := "5.1-dt-20190425Z-e158d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-b37c9c",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-64a955",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190612Z-9bbe17",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-fb78fe",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190616Z-f769ee",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-3e62fa",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-ef245c",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-d45bbb",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-166c9f",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        