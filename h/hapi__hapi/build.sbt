organization := "org.scalablytyped"
name := "hapi__hapi"
version := "18.2-dt-20190404Z-47200f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-7ea797",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190404Z-9ac4a8",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-b88587",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190404Z-a36b69",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-afe7b0",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-55f7d9",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-46e0f3",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-e0e89b",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        