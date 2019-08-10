organization := "org.scalablytyped"
name := "jupyterlab__rendermime-interfaces"
version := "1.3.0-6a1a4b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-88b58f",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.0-3a806a",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-df57f7",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.0-0d15fa",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-27e712",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.0-4cce89",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-e0bcde",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.0-503993",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        