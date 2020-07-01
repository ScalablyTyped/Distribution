organization := "org.scalablytyped"
name := "jest__fake-timers"
version := "24.9.0-0823cd"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-195967",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-62a062",
  "org.scalablytyped" %%% "jest-message-util" % "24.9.0-eab3f9",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-83874a",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-da5e37",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-a7a4e8",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-ff89d3",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-aea877",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "stack-utils" % "1.0-dt-20200515Z-9be1be",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
