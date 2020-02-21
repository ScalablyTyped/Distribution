organization := "org.scalablytyped"
name := "jupyterlab__codemirror-extension"
version := "1.2.1-07293f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-ffacbb",
  "org.scalablytyped" %%% "jupyterlab__application" % "1.2.1-c0171d",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.2.1-99cdf6",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "1.2.0-a3719d",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.2.0-3afb42",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "1.2.1-486f09",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.4.0-c60f77",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "1.2.1-115f15",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.5.0-3bb77a",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.2.0-5360ed",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-f67ca9",
  "org.scalablytyped" %%% "phosphor__application" % "1.7.3-419463",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.2-d9ce1e",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-4620d1",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-6eae76",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-d4f353",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-6b2b50",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-fa6e0d",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.3-9a92aa",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-05a52c",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200122Z-b17eee",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
