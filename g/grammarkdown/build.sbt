organization := "org.scalablytyped"
name := "grammarkdown"
version := "2.2.0-40eea0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "esfx__async-canceltoken" % "1.0.0-pre.13-f06eae",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.13-cb2c15",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.13-b585e3",
  "org.scalablytyped" %%% "prex" % "0.4.7-b55acd",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
