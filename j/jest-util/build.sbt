organization := "org.scalablytyped"
name := "jest-util"
version := "24.9.0-1c9a55"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-85cdab",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-89f95c",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-03caa1",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-6a4f26",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-17268e",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-74c65d",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-a9314f",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-ea894d",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-b2dec0",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191101Z-508d7c",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-f54c2a",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20190925Z-fa65c4",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-0a7d60")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        