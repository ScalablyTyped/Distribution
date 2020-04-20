organization := "org.scalablytyped"
name := "jest__test-result"
version := "24.9.0-5bcede"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "callsites" % "3.1.0-c8de4e",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20190425Z-7617e4",
  "org.scalablytyped" %%% "jest__console" % "24.9.0-0f37bd",
  "org.scalablytyped" %%% "jest__source-map" % "24.9.0-6f5d9c",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-fcf18c",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
