organization := "org.scalablytyped"
name := "material__data-table"
version := "8.0.0-225cc6"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "material__base" % "8.0.0-b5bf49",
  "org.scalablytyped" %%% "material__checkbox" % "8.0.0-ae8fe1",
  "org.scalablytyped" %%% "material__ripple" % "8.0.0-7e35fe",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
