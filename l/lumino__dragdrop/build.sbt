organization := "org.scalablytyped"
name := "lumino__dragdrop"
version := "1.5.3-552fdb"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.2.3-8f615e",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.4.3-277bff",
  "org.scalablytyped" %%% "lumino__disposable" % "1.3.6-a20907",
  "org.scalablytyped" %%% "lumino__signaling" % "1.3.6-bd579a",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
