organization := "org.scalablytyped"
name := "jupyterlab__coreutils"
version := "3.2.0-3afb42"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-f67ca9",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.2-d9ce1e",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-4620d1",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-6eae76",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-6b2b50",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
