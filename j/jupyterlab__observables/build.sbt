organization := "org.scalablytyped"
name := "jupyterlab__observables"
version := "2.4.0-43843a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-64f755",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-94a0c4",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-b5ce53",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-4a260b",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-fc1902",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        