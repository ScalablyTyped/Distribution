organization := "org.scalablytyped"
name := "jupyterlab__coreutils"
version := "2.2.1-1ec723"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-165e39",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-801f09",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-eaf19f",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-e890df",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        