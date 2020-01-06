organization := "org.scalablytyped"
name := "jest-resolve-dependencies"
version := "24.9.0-396d0e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d4520c",
  "org.scalablytyped" %%% "callsites" % "3.1.0-466cd3",
  "org.scalablytyped" %%% "chalk" % "2.4.2-40fe0b",
  "org.scalablytyped" %%% "expect" % "24.9.0-10ae08",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-0b8c96",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-dd777f",
  "org.scalablytyped" %%% "jest-matcher-utils" % "21.0-dt-20190212Z-1e02a6",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-4b2254",
  "org.scalablytyped" %%% "jest-resolve" % "24.9.0-30c4d1",
  "org.scalablytyped" %%% "jest-snapshot" % "24.9.0-09ae80",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-823552",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-2d60bb",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-746968",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-77a898",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-dcd405",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-69457f",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20191223Z-ba019c",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-1ea3a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        