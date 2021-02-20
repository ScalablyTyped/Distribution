organization := "org.scalablytyped"
name := "material__tab-bar"
version := "8.0.0-4606f7"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "material__base" % "8.0.0-b5bf49",
  "org.scalablytyped" %%% "material__ripple" % "8.0.0-7e35fe",
  "org.scalablytyped" %%% "material__tab" % "8.0.0-79871a",
  "org.scalablytyped" %%% "material__tab-indicator" % "8.0.0-658a59",
  "org.scalablytyped" %%% "material__tab-scroller" % "8.0.0-31b2b6",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
