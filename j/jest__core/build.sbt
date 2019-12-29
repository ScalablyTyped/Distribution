organization := "org.scalablytyped"
name := "jest__core"
version := "24.9.0-fc0947"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-5d9733",
  "org.scalablytyped" %%% "callsites" % "3.1.0-7e8bf2",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-3ca4dc",
  "org.scalablytyped" %%% "jest-changed-files" % "24.9.0-d2ddf6",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-ea8a60",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-71bb19",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-d85e6e",
  "org.scalablytyped" %%% "jest-resolve" % "24.9.0-692843",
  "org.scalablytyped" %%% "jest-runner" % "24.9.0-061b3a",
  "org.scalablytyped" %%% "jest-runtime" % "24.9.0-77fba7",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-5a4999",
  "org.scalablytyped" %%% "jest__environment" % "24.9.0-99748f",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-8da2f3",
  "org.scalablytyped" %%% "jest__reporters" % "24.9.0-ddefdf",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-83d602",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-0deee2",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-824122",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-a410a8",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20191223Z-dc2042",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-3838fc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        