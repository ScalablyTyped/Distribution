organization := "org.scalablytyped"
name := "hapi__yar"
version := "9.2-dt-20190425Z-a37725"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-e07782",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-679aad",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200515Z-2e543b",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-e62043",
  "org.scalablytyped" %%% "hapi__joi" % "17.1-dt-20200505Z-5c6806",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200424Z-dfa6ce",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20200515Z-4b0358",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-6aa194",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-ce2530",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
