organization := "org.scalablytyped"
name := "hapi__hawk"
version := "8.0-dt-20200122Z-edacf2"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20200515Z-cf4980",
  "org.scalablytyped" %%% "crypto-js" % "v3.1.8-dt-20200515Z-ff01f8",
  "org.scalablytyped" %%% "form-data" % "3.0.0-81582a",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-e07782",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-679aad",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200515Z-2e543b",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-e62043",
  "org.scalablytyped" %%% "hapi__joi" % "17.1-dt-20200505Z-5c6806",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200424Z-dfa6ce",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20200515Z-4b0358",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-6aa194",
  "org.scalablytyped" %%% "hapi__sntp" % "3.1-dt-20200515Z-3dc4e3",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-ce2530",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "request" % "2.48-dt-20200515Z-fef1ef",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20200515Z-ec5ef6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
