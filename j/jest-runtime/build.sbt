organization := "org.scalablytyped"
name := "jest-runtime"
version := "25.3.0-39377f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-1bb4ae",
  "org.scalablytyped" %%% "callsites" % "3.1.0-c8de4e",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-7617e4",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-5fb9c7",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-d84a3a",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-3e3a72",
  "org.scalablytyped" %%% "jest-resolve" % "24.9.0-2ee24c",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-0f37bd",
  "org.scalablytyped" %%% "jest__environment" % "25.3.0-8af67d",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-1e6f62",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-6f5d9c",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-5bcede",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-fcf18c",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20200225Z-a14ab4",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "yargs" % "15.0-dt-20200225Z-5b0019",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-06e513")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
