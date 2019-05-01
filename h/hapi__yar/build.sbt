organization := "org.scalablytyped"
name := "hapi__yar"
version := "9.2-dt-20190425Z-3518b5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-4d4fed",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190404Z-02b38b",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190426Z-07f7ca",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-d8e1d7",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190425Z-2b069f",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-301222",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-ac577d",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-a0c808",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-38d1ba",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-40b461",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        