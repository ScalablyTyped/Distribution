organization := "org.scalablytyped"
name := "material__select"
version := "8.0.0-ad5a7f"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "material__base" % "8.0.0-b5bf49",
  "org.scalablytyped" %%% "material__floating-label" % "8.0.0-9a90bf",
  "org.scalablytyped" %%% "material__line-ripple" % "8.0.0-d3936e",
  "org.scalablytyped" %%% "material__list" % "8.0.0-903562",
  "org.scalablytyped" %%% "material__menu" % "8.0.0-e8d691",
  "org.scalablytyped" %%% "material__menu-surface" % "8.0.0-37119b",
  "org.scalablytyped" %%% "material__notched-outline" % "8.0.0-49229b",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
