organization := "org.scalablytyped"
name := "hapi__basic"
version := "5.1-dt-20200225Z-6fb688"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-42a2a0",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-3bb96a",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200227Z-b8f581",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-94df23",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20200225Z-f77a38",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200330Z-731415",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20200225Z-739834",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-4de64d",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20200330Z-b5288f",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
