organization := "org.scalablytyped"
name := "material__checkbox"
version := "0.35-dt-20200515Z-cc1c1d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20200515Z-5bcbd5",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20200515Z-16f14e",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20200515Z-42e23b",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
