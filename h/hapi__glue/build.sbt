organization := "org.scalablytyped"
name := "hapi__glue"
version := "6.1-dt-20190425Z-3b04e5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-7ea797",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190404Z-9ac4a8",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190417Z-ef6d9c",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-17aa30",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190425Z-7b6210",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-afe7b0",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-55f7d9",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-b166fb",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-e0e89b",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190422Z-40afee",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        