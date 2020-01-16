organization := "org.scalablytyped"
name := "jest-resolve-dependencies"
version := "24.9.0-11d118"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d4520c",
  "org.scalablytyped" %%% "callsites" % "3.1.0-466cd3",
  "org.scalablytyped" %%% "chalk" % "2.4.2-40fe0b",
  "org.scalablytyped" %%% "expect" % "24.9.0-15a2b1",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-0b8c96",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-0d982f",
  "org.scalablytyped" %%% "jest-matcher-utils" % "21.0-dt-20190212Z-1e02a6",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-c17025",
  "org.scalablytyped" %%% "jest-resolve" % "24.9.0-961805",
  "org.scalablytyped" %%% "jest-snapshot" % "24.9.0-25d117",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-a21ca4",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-2d60bb",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-89dc75",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-095f59",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-dcd405",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20180214Z-69457f",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "yargs" % "15.0-dt-20200108Z-421d1d",
  "org.scalablytyped" %%% "yargs-parser" % "15.0-dt-20200113Z-47492f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        