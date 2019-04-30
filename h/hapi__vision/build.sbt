organization := "org.scalablytyped"
name := "hapi__vision"
version := "5.5-dt-20190412Z-713149"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-7ea797",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190404Z-9ac4a8",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190426Z-847467",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-d08d49",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190425Z-7b6210",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-afe7b0",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-55f7d9",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-375f36",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-e0e89b",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190429Z-d35e72",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        