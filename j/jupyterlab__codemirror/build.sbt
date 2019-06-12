organization := "org.scalablytyped"
name := "jupyterlab__codemirror"
version := "0.19.1-ca7dda"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "codemirror" % "0.0-unknown-dt-20190409Z-c7a32f",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-e82a53",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-5e4735",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-cda69c",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-643ad4",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-6bf0f7",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-55aa1a",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "tern" % "0.23-dt-20190516Z-c6633e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        