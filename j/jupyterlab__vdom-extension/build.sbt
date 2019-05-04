organization := "org.scalablytyped"
name := "jupyterlab__vdom-extension"
version := "0.18.1-9bd232"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.2.1-8e146c",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-5c87e1",
  "org.scalablytyped" %%% "phosphor__commands" % "1.6.1-4e0b1d",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-e670f1",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-ac46d5",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.2-56ae61",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-ada9c2",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.1.2-d794d9",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.6.0-193f21",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        