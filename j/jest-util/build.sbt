organization := "org.scalablytyped"
name := "jest-util"
version := "24.9.0-4e35b3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-85cdab",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-89f95c",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-1baf87",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-c78988",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-1ac4b6",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-884650",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-a9314f",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-3e5670",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-b55a1e",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191030Z-4bf573",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-f54c2a",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20190925Z-fa65c4",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-0a7d60")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        