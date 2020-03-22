organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20200122Z-2d3429"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-31fe0d",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20191126Z-a55f28",
  "org.scalablytyped" %%% "form-data" % "3.0.0-cd343e",
  "org.scalablytyped" %%% "hapi__boom" % "9.0.0-9b646a",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-3bb96a",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200130Z-8d0dba",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-ae53b9",
  "org.scalablytyped" %%% "hapi__joi" % "16.0-dt-20200214Z-8014a8",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20190404Z-0aa4d1",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20190404Z-739834",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-6dfda0",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20190425Z-32fb23",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-574028",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-b16f5b",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20191206Z-a3036c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
