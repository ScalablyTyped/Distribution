organization := "org.scalablytyped"
name := "jest-runner"
version := "26.2.2-9f10a0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20200515Z-4cc09b",
  "org.scalablytyped" %%% "callsites" % "3.1.0-feea14",
  "org.scalablytyped" %%% "emittery" % "0.7.1-bf995d",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-73ff2c",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-c96a20",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-039104",
  "org.scalablytyped" %%% "jest-resolve" % "24.9.0-76093e",
  "org.scalablytyped" %%% "jest-runtime" % "26.2.2-a757f2",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-945758",
  "org.scalablytyped" %%% "jest__environment" % "26.2.0-b36189",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-54be48",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-f4ebe1",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-dd389b",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
