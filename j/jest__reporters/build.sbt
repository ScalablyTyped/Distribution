organization := "org.scalablytyped"
name := "jest__reporters"
version := "26.2.2-d9f144"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20200515Z-4cc09b",
  "org.scalablytyped" %%% "callsites" % "3.1.0-feea14",
  "org.scalablytyped" %%% "collect-v8-coverage" % "1.0.1-93ef5f",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-73ff2c",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-4c87cb",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-c96a20",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-945758",
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
