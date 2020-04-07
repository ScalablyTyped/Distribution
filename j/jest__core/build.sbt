organization := "org.scalablytyped"
name := "jest__core"
version := "25.1.0-6406ef"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d40bf1",
  "org.scalablytyped" %%% "callsites" % "3.1.0-477967",
  "org.scalablytyped" %%% "collect-v8-coverage" % "1.0.0-9a9adb",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-9611dd",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200121Z-9290d8",
  "org.scalablytyped" %%% "jest-changed-files" % "25.1.0-5836ae",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-a92e6d",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-63f05c",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-9f1f0d",
  "org.scalablytyped" %%% "jest-resolve" % "24.9.0-ad782b",
  "org.scalablytyped" %%% "jest-runner" % "25.1.0-fbbd3f",
  "org.scalablytyped" %%% "jest-runtime" % "25.1.0-79e807",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-c8869f",
  "org.scalablytyped" %%% "jest__environment" % "25.1.0-036b8b",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-56511f",
  "org.scalablytyped" %%% "jest__reporters" % "25.1.0-8174a1",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-87be6f",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-977254",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-3e0310",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20200225Z-285d25",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "yargs" % "15.0-dt-20200225Z-7bd147",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-5d49c5")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
