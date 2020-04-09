organization := "org.scalablytyped"
name := "jupyterlab__launcher"
version := "2.1.0-5b7cfc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "free-style" % "3.1.0-811240",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "2.1.0-6debfe",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "4.1.0-c87d6c",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "2.1.0-6c39cd",
  "org.scalablytyped" %%% "jupyterlab__observables" % "3.1.0-74e8c6",
  "org.scalablytyped" %%% "jupyterlab__services" % "5.1.0-61baad",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "2.1.0-ee145e",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "2.1.0-4f454d",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "2.1.0-ef1be9",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.2.3-935244",
  "org.scalablytyped" %%% "lumino__commands" % "1.10.1-857d11",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.4.2-dc12c7",
  "org.scalablytyped" %%% "lumino__disposable" % "1.3.5-0b92af",
  "org.scalablytyped" %%% "lumino__messaging" % "1.3.3-8057f4",
  "org.scalablytyped" %%% "lumino__polling" % "1.1.1-1f4f42",
  "org.scalablytyped" %%% "lumino__signaling" % "1.3.5-97c4b4",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.6.1-57e815",
  "org.scalablytyped" %%% "lumino__widgets" % "1.11.1-eab737",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200402Z-6f4338",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "typestyle" % "2.1.0-006ad9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
