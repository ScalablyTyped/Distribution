organization := "org.scalablytyped"
name := "jest-resolve-dependencies"
version := "24.9.0-34fed4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chalk" % "2.4.2-fe7c64",
  "org.scalablytyped" %%% "expect" % "24.9.0-675bff",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-bbbcc9",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-79a178",
  "org.scalablytyped" %%% "jest-matcher-utils" % "21.0-dt-20190212Z-073f1d",
  "org.scalablytyped" %%% "jest-resolve" % "24.9.0-f42f74",
  "org.scalablytyped" %%% "jest-snapshot" % "24.9.0-cf7ac3",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-c2de98",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "pretty-format" % "24.9.0-7308f8",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "yargs" % "13.0-dt-20190925Z-48cb57",
  "org.scalablytyped" %%% "yargs-parser" % "13.1-dt-20190905Z-3f7049")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        