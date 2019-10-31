organization := "org.scalablytyped"
name := "jupyterlab__codeeditor"
version := "1.2.0-967511"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.2.0-30b104",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.4.0-4c2162",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-16d154",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.2-f3a464",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-78483d",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-29a624",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-c20c6a",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-ea161c",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-2353cf",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.3-2a9409",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        