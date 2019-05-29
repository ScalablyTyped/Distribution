organization := "org.scalablytyped"
name := "jupyterlab__services"
version := "3.2.1-3ddddb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-eb528f",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.1.1-f0dbe0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-3a5136",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-107474",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-df44ce",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.2-f969aa",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-e93992",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        