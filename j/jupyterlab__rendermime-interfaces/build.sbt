organization := "org.scalablytyped"
name := "jupyterlab__rendermime-interfaces"
version := "1.4.0-7233fd"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-db25ba",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.0-090f7b",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-2e6e2f",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.0-38a9ea",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-a58088",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.0-429f20",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-ca23e6",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.0-b21f1a",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        