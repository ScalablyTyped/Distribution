organization := "org.scalablytyped"
name := "jupyterlab__coreutils"
version := "3.2.0-e7a73f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-cad8ac",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.2-86b809",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-18e14c",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-0ffa92",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-9147b0",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        