organization := "org.scalablytyped"
name := "jest-environment-puppeteer"
version := "4.3-dt-20190819Z-bc4c22"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-61ae0f",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-797456",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-6db53f",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-c69dc9",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-6482c5",
  "org.scalablytyped" %%% "jest__environment" % "24.9.0-f357c2",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-7355a3",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-3cceb5",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-e23a6b",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-7399ab",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191119Z-94c257",
  "org.scalablytyped" %%% "puppeteer" % "2.0-dt-20191119Z-459f93",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-60ee07",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20190925Z-22543c",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-34249b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        