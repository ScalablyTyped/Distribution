organization := "org.scalablytyped"
name := "jupyterlab__mathjax2"
version := "1.2.0-947f4c"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.5.0-3243c2",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-64f755",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.2-d6a857",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-94a0c4",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-b5ce53",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-4a260b",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-fc1902",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-b6f64a",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.3-8e0e80",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        