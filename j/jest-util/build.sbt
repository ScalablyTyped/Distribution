organization := "org.scalablytyped"
name := "jest-util"
version := "24.9.0-b550b1"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-3bda2a",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-bbbcc9",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-d44a70",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-98dde0",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-810b3d",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-fd1ece",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-48095f",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-1ab04d",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-045540",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191210Z-b5c359",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-b11e18",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20191126Z-efb256",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-f741f6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        