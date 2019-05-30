organization := "org.scalablytyped"
name := "jupyterlab__codeeditor"
version := "0.19.1-6509b1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-fe0d52",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.1.1-58610e",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-1d7d70",
  "org.scalablytyped" %%% "phosphor__commands" % "1.6.1-ab0888",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-358d58",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-26ec90",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.2-ce2d49",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-ccd102",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.1.2-c47dd8",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.6.0-a42f1d",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        