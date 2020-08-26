organization := "org.scalablytyped"
name := "jest-environment-jsdom"
version := "26.2.0-474967"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-73ff2c",
  "org.scalablytyped" %%% "jest-mock" % "24.9.0-039104",
  "org.scalablytyped" %%% "jest__environment" % "26.2.0-b36189",
  "org.scalablytyped" %%% "jest__types" % "24.9.0-dd389b",
  "org.scalablytyped" %%% "jsdom" % "16.2-dt-20200515Z-22e0e4",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200724Z-6c1ba3",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20200515Z-a5c018",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20200515Z-1a740a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
