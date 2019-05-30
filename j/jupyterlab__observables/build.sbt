organization := "org.scalablytyped"
name := "jupyterlab__observables"
version := "2.1.1-58610e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-1d7d70",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-358d58",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-26ec90",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.2-ce2d49",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-ccd102",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        