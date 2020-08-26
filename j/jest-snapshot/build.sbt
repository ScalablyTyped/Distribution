organization := "org.scalablytyped"
name := "jest-snapshot"
version := "24.9.0-f75e30"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20200515Z-4cc09b",
  "org.scalablytyped" %%% "callsites" % "3.1.0-feea14",
  "org.scalablytyped" %%% "chalk" % "4.1.0-f17808",
  "org.scalablytyped" %%% "expect" % "26.2.0-52fb08",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-73ff2c",
  "org.scalablytyped" %%% "jest-diff" % "26.2.0-577337",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-c96a20",
  "org.scalablytyped" %%% "jest-matcher-utils" % "26.2.0-2bf616",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-3ad062",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-945758",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-54be48",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-f4ebe1",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-dd389b",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "pretty-format" % "26.2.0-662c48",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20200515Z-f013d4",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
