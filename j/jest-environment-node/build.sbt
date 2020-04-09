organization := "org.scalablytyped"
name := "jest-environment-node"
version := "25.2.6-b4a85e"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-477967",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-9611dd",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-3254d4",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-95361d",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-d0bf30",
  "org.scalablytyped" %%% "jest__environment" % "25.2.6-af16da",
  "org.scalablytyped" %%% "jest__fake-timers" % "24.9.0-b1c2bb",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-87be6f",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-d72244",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-ba6b7b",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20200225Z-285d25",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
