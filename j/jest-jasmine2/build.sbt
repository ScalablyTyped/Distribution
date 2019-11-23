organization := "org.scalablytyped"
name := "jest-jasmine2"
version := "24.9.0-76a85f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20190725Z-4ce8d5",
  "org.scalablytyped" %%% "callsites" % "3.1.0-61ae0f",
  "org.scalablytyped" %%% "chalk" % "2.4.2-60c74f",
  "org.scalablytyped" %%% "expect" % "24.9.0-c39282",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-797456",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-8075c9",
  "org.scalablytyped" %%% "jest-matcher-utils" % "21.0-dt-20190212Z-ff4af6",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-4dbf3b",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-506273",
  "org.scalablytyped" %%% "jest-resolve" % "24.9.0-a3789d",
  "org.scalablytyped" %%% "jest-runtime" % "24.9.0-87eb39",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-a0907d",
  "org.scalablytyped" %%% "jest__environment" % "24.9.0-d0e04e",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-e01477",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-3cceb5",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-e04149",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-3a286f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-60ee07",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20190925Z-22543c",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-34249b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        