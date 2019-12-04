organization := "org.scalablytyped"
name := "jest-snapshot"
version := "24.9.0-a8d305"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-84e0a0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-3bda2a",
  "org.scalablytyped" %%% "chalk" % "2.4.2-fe7c64",
  "org.scalablytyped" %%% "expect" % "24.9.0-0f28f7",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-bbbcc9",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-674cad",
  "org.scalablytyped" %%% "jest-matcher-utils" % "21.0-dt-20190212Z-073f1d",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-0236a4",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-c4501d",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-48095f",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-e575ea",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-e1e74c",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-713c64",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-b11e18",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20191126Z-120655",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-3f7049")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        