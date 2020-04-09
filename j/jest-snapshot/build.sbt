organization := "org.scalablytyped"
name := "jest-snapshot"
version := "24.9.0-a5d50a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d40bf1",
  "org.scalablytyped" %%% "callsites" % "3.1.0-477967",
  "org.scalablytyped" %%% "chalk" % "3.0.0-bfdd6b",
  "org.scalablytyped" %%% "expect" % "25.2.7-9ac1db",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-9611dd",
  "org.scalablytyped" %%% "jest-diff" % "25.2.6-cc149a",
  "org.scalablytyped" %%% "jest-haste-map" % "24.9.0-593f7c",
  "org.scalablytyped" %%% "jest-matcher-utils" % "25.2.7-425a5c",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-3254d4",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-d0bf30",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-87be6f",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-d72244",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-ba6b7b",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "pretty-format" % "25.2.6-f4d625",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20200225Z-285d25",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
