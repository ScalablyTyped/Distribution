organization := "org.scalablytyped"
name := "jupyterlab__codemirror"
version := "0.19.1-2c70e9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "codemirror" % "0.0-unknown-dt-20190409Z-adf75f",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-a22775",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-fe0d52",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-1d7d70",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-358d58",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-26ec90",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-ccd102",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "tern" % "0.23-dt-20190516Z-fde13c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        