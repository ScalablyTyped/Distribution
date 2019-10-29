organization := "org.scalablytyped"
name := "jest-environment-puppeteer"
version := "4.3-dt-20190819Z-e71f6a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-85cdab",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-89f95c",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-cac9d0",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-81b7e0",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-32e4c3",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-0c1631",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-a9314f",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-b70527",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-dc659b",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "puppeteer" % "1.20-dt-20191010Z-b16b60",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-f54c2a",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20190925Z-fa65c4",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-0a7d60")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        