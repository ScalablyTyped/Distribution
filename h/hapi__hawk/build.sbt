organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20200925Z-3ffa29"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-ee840c",
  "org.scalablytyped" %%% "crypto-js" % "v4.0.0-dt-20201006Z-11ad3c",
  "org.scalablytyped" %%% "form-data" % "3.0.0-438be1",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-015fca",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20200925Z-9f5e62",
  "org.scalablytyped" %%% "hapi__hapi" % "20.0-dt-20201028Z-ed7e72",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-bda26a",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200925Z-292bbe",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20201002Z-2b3679",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20200925Z-75f810",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20200925Z-5388ef",
  "org.scalablytyped" %%% "joi" % "17.3.0-7ba32d",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-64e776",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-6ac064",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20201002Z-821692")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
