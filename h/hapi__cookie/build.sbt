organization := "org.scalablytyped"
name := "hapi__cookie"
version := "10.1-dt-20190425Z-039e8d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "hapi__boom" % "9.1.0-c3c652",
  "org.scalablytyped" %%% "hapi__catbox" % "10.2-dt-20190521Z-79f2ef",
  "org.scalablytyped" %%% "hapi__hapi" % "19.0-dt-20200515Z-873399",
  "org.scalablytyped" %%% "hapi__iron" % "6.0.0-dc51ac",
  "org.scalablytyped" %%% "hapi__joi" % "17.1-dt-20200624Z-8e0ffe",
  "org.scalablytyped" %%% "hapi__mimos" % "4.1-dt-20200424Z-619e36",
  "org.scalablytyped" %%% "hapi__podium" % "3.4-dt-20200515Z-220bcb",
  "org.scalablytyped" %%% "hapi__shot" % "4.1-dt-20190404Z-9b2d89",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20200424Z-5778e6",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
