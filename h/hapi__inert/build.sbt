organization := "org.scalablytyped"
name := "hapi__inert"
version := "5.2-dt-20190412Z-cfb6d8"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "9.0.0-140823",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-7ec75d",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200115Z-0bb313",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-977270",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20200103Z-856cb7",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-72bd5b",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-d2335c",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-7d414a",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-cef82e",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        