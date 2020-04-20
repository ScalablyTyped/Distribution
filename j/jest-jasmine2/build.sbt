organization := "org.scalablytyped"
name := "jest-jasmine2"
version := "25.3.0-2321aa"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-1bb4ae",
  "org.scalablytyped" %%% "assert" % "1.4-dt-20200204Z-24a1ae",
  "org.scalablytyped" %%% "callsites" % "3.1.0-c8de4e",
  "org.scalablytyped" %%% "chalk" % "3.0.0-a95f79",
  "org.scalablytyped" %%% "expect" % "25.3.0-feeb15",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-7617e4",
  "org.scalablytyped" %%% "jest-diff" % "25.3.0-8f8e6f",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-5fb9c7",
  "org.scalablytyped" %%% "jest-matcher-utils" % "25.3.0-89e6ba",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-d84a3a",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-3e3a72",
  "org.scalablytyped" %%% "jest-resolve" % "24.9.0-2ee24c",
  "org.scalablytyped" %%% "jest-runtime" % "25.3.0-39377f",
  "org.scalablytyped" %%% "jest-snapshot" % "24.9.0-82fc9f",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-0f37bd",
  "org.scalablytyped" %%% "jest__environment" % "25.3.0-8af67d",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-1e6f62",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-6f5d9c",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-5bcede",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-fcf18c",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "pretty-format" % "25.3.0-355595",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20200225Z-a14ab4",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "yargs" % "15.0-dt-20200225Z-5b0019",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-06e513")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
