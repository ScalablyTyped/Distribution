organization := "org.scalablytyped"
name := "hapi__yar"
version := "9.2-dt-20190425Z-7ad22f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-b37c9c",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-64a955",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190624Z-7bc57f",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-35f91b",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190616Z-f769ee",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-3e62fa",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-ef245c",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-ac4343",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-166c9f",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        