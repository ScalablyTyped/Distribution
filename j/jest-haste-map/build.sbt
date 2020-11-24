organization := "org.scalablytyped"
name := "jest-haste-map"
version := "24.9.0-995239"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20200515Z-13a40f",
  "org.scalablytyped" %%% "istanbul-lib-coverage" % "2.0-dt-20200609Z-d67580",
  "org.scalablytyped" %%% "istanbul-lib-report" % "3.0-dt-20200515Z-d99f6d",
  "org.scalablytyped" %%% "istanbul-reports" % "3.0-dt-20200720Z-d239e7",
  "org.scalablytyped" %%% "jest__types" % "26.6.2-7da828",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
