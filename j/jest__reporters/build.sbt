organization := "org.scalablytyped"
name := "jest__reporters"
version := "26.6.2-a25aac"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20200515Z-13a40f",
  "org.scalablytyped" %%% "callsites" % "3.1.0-f2c2ab",
  "org.scalablytyped" %%% "collect-v8-coverage" % "1.0.1-fd416e",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-d67580",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-d99f6d",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-d239e7",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-995239",
  "org.scalablytyped" %%% "jest-resolve" % "26.6.2-716c8d",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-3b85dc",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-1fff76",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-a3e834",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-7da828",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
