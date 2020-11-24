organization := "org.scalablytyped"
name := "jest-resolve-dependencies"
version := "26.6.3-9932d1"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20200515Z-13a40f",
  "org.scalablytyped" %%% "babel__traverse" % "7.0-dt-20200925Z-a4f96d",
  "org.scalablytyped" %%% "babel__types" % "7.12.7-603dc7",
  "org.scalablytyped" %%% "callsites" % "3.1.0-f2c2ab",
  "org.scalablytyped" %%% "chalk" % "4.1.0-7506f1",
  "org.scalablytyped" %%% "expect" % "26.6.2-24642d",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-d67580",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-d99f6d",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-d239e7",
  "org.scalablytyped" %%% "jest-diff" % "26.6.2-899f85",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-995239",
  "org.scalablytyped" %%% "jest-matcher-utils" % "26.6.2-538b14",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-cf0d5e",
  "org.scalablytyped" %%% "jest-resolve" % "26.6.2-716c8d",
  "org.scalablytyped" %%% "jest-snapshot" % "26.6.2-58f734",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-3b85dc",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-1fff76",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-a3e834",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-7da828",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "prettier" % "2.1-dt-20201016Z-a18acf",
  "org.scalablytyped" %%% "pretty-format" % "26.6.2-bba0e1",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20200921Z-2bcdad",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
