organization := "org.scalablytyped"
name := "material__textfield"
version := "8.0.0-8aafd6"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "8.0.0-4fe319",
  "org.scalablytyped" %%% "material__floating-label" % "8.0.0-1cd35a",
  "org.scalablytyped" %%% "material__line-ripple" % "8.0.0-50092d",
  "org.scalablytyped" %%% "material__notched-outline" % "8.0.0-7b9b18",
  "org.scalablytyped" %%% "material__ripple" % "8.0.0-2baa12",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
