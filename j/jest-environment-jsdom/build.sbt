organization := "org.scalablytyped"
name := "jest-environment-jsdom"
version := "24.9.0-974f1a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-e70151",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-de6979",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-bd445c",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-60b9b9",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-868810",
  "org.scalablytyped" %%% "jest__environment" % "24.9.0-b0e3bb",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-ad2fb5",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-f47ace",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-322d5e",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-558047",
  "org.scalablytyped" %%% "jsdom" % "12.2-dt-20190626Z-b7ceba",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-1b000b",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20191206Z-711cb5",
  "org.scalablytyped" %%% "yargs" % "15.0-dt-20200108Z-73eb79",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-62354a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        