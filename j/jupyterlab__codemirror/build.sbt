organization := "org.scalablytyped"
name := "jupyterlab__codemirror"
version := "0.19.1-a71607"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "codemirror" % "0.0-unknown-dt-20190409Z-8ac890",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-4bb05f",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-9b35aa",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-5c87e1",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-e670f1",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-ac46d5",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-ada9c2",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "tern" % "0.23-dt-20190405Z-f1d57d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        