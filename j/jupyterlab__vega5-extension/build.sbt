organization := "org.scalablytyped"
name := "jupyterlab__vega5-extension"
version := "2.2.1-9911e0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "2.2.1-3e1a4a",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.3.3-6bbf10",
  "org.scalablytyped" %%% "lumino__commands" % "1.11.4-8bc52a",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.5.3-5b541b",
  "org.scalablytyped" %%% "lumino__disposable" % "1.4.3-c29ef2",
  "org.scalablytyped" %%% "lumino__messaging" % "1.4.3-5292d0",
  "org.scalablytyped" %%% "lumino__signaling" % "1.4.3-db0b39",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.7.3-79bff6",
  "org.scalablytyped" %%% "lumino__widgets" % "1.14.1-dfc7b4",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
