organization := "org.scalablytyped"
name := "jest-cli"
version := "24.9.0-6034ed"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-84e0a0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-3bda2a",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-bbbcc9",
  "org.scalablytyped" %%% "jest-changed-files" % "24.9.0-1ea008",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-674cad",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-0236a4",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-7776dc",
  "org.scalablytyped" %%% "jest-resolve" % "24.9.0-7ac885",
  "org.scalablytyped" %%% "jest-runner" % "24.9.0-0e6090",
  "org.scalablytyped" %%% "jest-runtime" % "24.9.0-6842e9",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-c4501d",
  "org.scalablytyped" %%% "jest__core" % "24.9.0-c38015",
  "org.scalablytyped" %%% "jest__environment" % "24.9.0-7f56fc",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-d75551",
  "org.scalablytyped" %%% "jest__reporters" % "24.9.0-2ea8af",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-48095f",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-e575ea",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-e1e74c",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "prompts" % "2.0-dt-20191106Z-e98e0a",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-b11e18",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20191126Z-120655",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-3f7049")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        