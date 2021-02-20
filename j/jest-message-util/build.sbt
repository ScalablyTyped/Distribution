organization := "org.scalablytyped"
name := "jest-message-util"
version := "24.9.0-f5539e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-edeffd",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-91b57a",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-c02776",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-38cda5",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-8a5244",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-458166",
  "org.scalablytyped" %%% "jest__test-result" % "24.9.0-5c0cf0",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-14cad6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "stack-utils" % "2.0-dt-20200921Z-d99a24",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
