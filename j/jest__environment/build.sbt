organization := "org.scalablytyped"
name := "jest__environment"
version := "24.9.0-a4ba0c"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-9a2e81",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200515Z-901968",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-a4a28f",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-db0f9e",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-2567fb",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-3a530f",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-a72309",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-4043f6",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-cdd098",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200521Z-3aabb7",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20200515Z-edb340",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
