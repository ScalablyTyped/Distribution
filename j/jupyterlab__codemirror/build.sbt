organization := "org.scalablytyped"
name := "jupyterlab__codemirror"
version := "0.19.1-095caf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "codemirror" % "0.0-unknown-dt-20190409Z-b9e9cd",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-79a60f",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-eb528f",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-3a5136",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-107474",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-df44ce",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-e93992",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "tern" % "0.23-dt-20190516Z-232917")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        