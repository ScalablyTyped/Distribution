organization := "org.scalablytyped"
name := "jest-runtime"
version := "26.6.3-2648ab"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20200515Z-13a40f",
  "org.scalablytyped" %%% "callsites" % "3.1.0-f2c2ab",
  "org.scalablytyped" %%% "chalk" % "4.1.0-7506f1",
  "org.scalablytyped" %%% "expect" % "26.6.2-24642d",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-d67580",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-d99f6d",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-d239e7",
  "org.scalablytyped" %%% "jest-diff" % "26.6.2-899f85",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-995239",
  "org.scalablytyped" %%% "jest-matcher-utils" % "26.6.2-538b14",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-cad9fb",
  "org.scalablytyped" %%% "jest-resolve" % "26.6.2-716c8d",
  "org.scalablytyped" %%% "jest__environment" % "26.6.2-bde1db",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-1fff76",
  "org.scalablytyped" %%% "jest__transform" % "26.6.2-bb5d03",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-7da828",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
