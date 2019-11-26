organization := "org.scalablytyped"
name := "jest-environment-puppeteer"
version := "4.3-dt-20190819Z-023616"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-3bda2a",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-bbbcc9",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-29c10a",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-f208ea",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-52c0f5",
  "org.scalablytyped" %%% "jest__environment" % "24.9.0-caa060",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-dfcec3",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-48095f",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-6422eb",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-8c0b96",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "puppeteer" % "2.0-dt-20191119Z-280384",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-b11e18",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20190925Z-48cb57",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-3f7049")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        