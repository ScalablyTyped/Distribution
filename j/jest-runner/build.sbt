organization := "org.scalablytyped"
name := "jest-runner"
version := "25.1.0-e0dae3"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d40bf1",
  "org.scalablytyped" %%% "callsites" % "3.1.0-477967",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-9611dd",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-29eef6",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-6ee843",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-5f7726",
  "org.scalablytyped" %%% "jest-resolve" % "24.9.0-63278e",
  "org.scalablytyped" %%% "jest-runtime" % "25.1.0-54990a",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-9bf29f",
  "org.scalablytyped" %%% "jest__environment" % "25.1.0-8affcc",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-b10253",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-87be6f",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-976532",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-a100a3",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-285d25",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "yargs" % "15.0-dt-20200131Z-f7366a",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-fd27cb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
