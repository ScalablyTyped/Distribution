organization := "org.scalablytyped"
name := "jest-snapshot"
version := "24.9.0-a573d5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-5d9733",
  "org.scalablytyped" %%% "callsites" % "3.1.0-7e8bf2",
  "org.scalablytyped" %%% "chalk" % "2.4.2-6a8820",
  "org.scalablytyped" %%% "expect" % "24.9.0-f1d8fe",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-3ca4dc",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-ea8a60",
  "org.scalablytyped" %%% "jest-matcher-utils" % "21.0-dt-20190212Z-2b5898",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-71bb19",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-5a4999",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-83d602",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-0deee2",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-824122",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-3b4753",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-a410a8",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20191223Z-dc2042",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-3838fc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        