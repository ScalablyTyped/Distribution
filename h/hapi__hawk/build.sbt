organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20200122Z-d180b4"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-31fe0d",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20191126Z-6101f2",
  "org.scalablytyped" %%% "form-data" % "2.5.1-036886",
  "org.scalablytyped" %%% "hapi__boom" % "9.0.0-e6a605",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-1fb598",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200130Z-12293b",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-b69be2",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20200214Z-37ed18",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-7697d4",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-b0c9c9",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-000407",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20190425Z-49a9ff",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-963524",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-ab6848",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20191206Z-5ae06d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
