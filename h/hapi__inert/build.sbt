organization := "org.scalablytyped"
name := "hapi__inert"
version := "5.2-dt-20190412Z-9b1358"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "7.4-dt-20190404Z-6e17ff",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-a9414f",
  "org.scalablytyped" %%% "hapi__hapi" % "18.2-dt-20190624Z-a7e66a",
  "org.scalablytyped" %%% "hapi__iron" % "5.1-dt-20190404Z-642344",
  "org.scalablytyped" %%% "hapi__joi" % "15.0-dt-20190722Z-f97fcb",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-31dd4c",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-ee10bf",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-26abd1",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-cb7ee4",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190806Z-18826b",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        