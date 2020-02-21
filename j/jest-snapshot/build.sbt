organization := "org.scalablytyped"
name := "jest-snapshot"
version := "24.9.0-c937f4"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-562662",
  "org.scalablytyped" %%% "callsites" % "3.1.0-da9ecd",
  "org.scalablytyped" %%% "expect" % "24.9.0-4851dc",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-324a95",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-41a578",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-ed789b",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-4cdd06",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-f62bca",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-d3480a",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-19d4ce",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-c68b79",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-8218ec",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "yargs" % "15.0-dt-20200131Z-03bed8",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-3a25a3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
