organization := "org.scalablytyped"
name := "jupyterlab__codemirror"
version := "0.19.1-fa2403"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "codemirror" % "0.0-unknown-dt-20190409Z-5d3f2a",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-83b406",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-1df345",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-6b8368",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-e30cce",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-f3e18f",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-388c7f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "tern" % "0.23-dt-20190516Z-23bd87")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        