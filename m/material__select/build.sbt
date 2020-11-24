organization := "org.scalablytyped"
name := "material__select"
version := "8.0.0-518f2e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "8.0.0-4fe319",
  "org.scalablytyped" %%% "material__floating-label" % "8.0.0-1cd35a",
  "org.scalablytyped" %%% "material__line-ripple" % "8.0.0-50092d",
  "org.scalablytyped" %%% "material__list" % "8.0.0-29ecfa",
  "org.scalablytyped" %%% "material__menu" % "8.0.0-56995f",
  "org.scalablytyped" %%% "material__menu-surface" % "8.0.0-ed0324",
  "org.scalablytyped" %%% "material__notched-outline" % "8.0.0-7b9b18",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
