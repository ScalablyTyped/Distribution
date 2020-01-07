organization := "org.scalablytyped"
name := "jest__fake-timers"
version := "24.9.0-36f15b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-466cd3",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-0b8c96",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-80bec7",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-a1feff",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-34fbd5",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-2d60bb",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-042248",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-c14a56",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-69457f",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20191223Z-a96822",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20200106Z-1ea3a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        