organization := "org.scalablytyped"
name := "jupyterlab__observables"
version := "2.4.0-5309cf"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-03ab75",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-9f6a55",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-854e3a",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-fd3816",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-a82dbc",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        