organization := "org.scalablytyped"
name := "jupyterlab__coreutils"
version := "2.2.1-5e4735"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-cda69c",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-643ad4",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-6bf0f7",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-55aa1a",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        