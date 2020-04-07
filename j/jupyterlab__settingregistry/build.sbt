organization := "org.scalablytyped"
name := "jupyterlab__settingregistry"
version := "2.0.1-608156"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "2.0.1-eadf5c",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.2.3-935244",
  "org.scalablytyped" %%% "lumino__commands" % "1.10.1-857d11",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.4.2-dc12c7",
  "org.scalablytyped" %%% "lumino__disposable" % "1.3.5-0b92af",
  "org.scalablytyped" %%% "lumino__signaling" % "1.3.5-97c4b4",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.6.1-57e815",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
