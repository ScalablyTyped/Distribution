organization := "org.scalablytyped"
name := "jest-environment-node"
version := "24.9.0-8517a5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-3bda2a",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-bbbcc9",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-cae444",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-7776dc",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-c4501d",
  "org.scalablytyped" %%% "jest__environment" % "24.9.0-57d0d9",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-863f70",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-48095f",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-a30eb9",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-141d8f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-b11e18",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20191126Z-efb256",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-f741f6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        