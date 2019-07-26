organization := "org.scalablytyped"
name := "jupyterlab__vega5-extension"
version := "1.0.1-3e5c49"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.3.0-dc3760",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.3-165e39",
  "org.scalablytyped" %%% "phosphor__commands" % "1.6.3-2534d7",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-801f09",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.2.0-0d2241",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.3-f0e1c7",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.3-e890df",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.1.3-e146b8",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.8.1-13d428",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        