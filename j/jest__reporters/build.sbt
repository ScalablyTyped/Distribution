organization := "org.scalablytyped"
name := "jest__reporters"
version := "24.9.0-83edd2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-3bda2a",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-bbbcc9",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-79a178",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-ab1793",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-9bb190",
  "org.scalablytyped" %%% "jest-resolve" % "24.9.0-f42f74",
  "org.scalablytyped" %%% "jest-runtime" % "24.9.0-68945a",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-adcfde",
  "org.scalablytyped" %%% "jest__environment" % "24.9.0-41bce4",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-b794cd",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-48095f",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-f3ca37",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-c2de98",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-b11e18",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20190925Z-48cb57",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-3f7049")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        