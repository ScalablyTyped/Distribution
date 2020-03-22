organization := "org.scalablytyped"
name := "jupyterlab__documentsearch"
version := "2.0.2-84e45b"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "codemirror" % "0.0-unknown-dt-20200317Z-fbcb90",
  "org.scalablytyped" %%% "csstype" % "2.6.9-2d2033",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20200320Z-692182",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "2.0.2-08bc74",
  "org.scalablytyped" %%% "jupyterlab__attachments" % "2.0.2-234cd3",
  "org.scalablytyped" %%% "jupyterlab__cells" % "2.0.2-7b90a8",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "2.0.2-9c99d5",
  "org.scalablytyped" %%% "jupyterlab__codemirror" % "2.0.2-07f11d",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "4.0.2-5aeb71",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "2.0.2-566cd9",
  "org.scalablytyped" %%% "jupyterlab__fileeditor" % "2.0.2-51ba3d",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "2.0.1-03f5a6",
  "org.scalablytyped" %%% "jupyterlab__notebook" % "2.0.2-03635d",
  "org.scalablytyped" %%% "jupyterlab__observables" % "3.0.1-09bcc0",
  "org.scalablytyped" %%% "jupyterlab__outputarea" % "2.0.2-798cc0",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "2.0.2-1c7292",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "2.0.1-10e0ba",
  "org.scalablytyped" %%% "jupyterlab__services" % "5.0.2-6da4a2",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "2.0.1-063374",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "2.0.1-eadf5c",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "2.0.2-c40b9d",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.2.3-935244",
  "org.scalablytyped" %%% "lumino__commands" % "1.10.1-857d11",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.4.2-dc12c7",
  "org.scalablytyped" %%% "lumino__disposable" % "1.3.5-0b92af",
  "org.scalablytyped" %%% "lumino__messaging" % "1.3.3-8057f4",
  "org.scalablytyped" %%% "lumino__polling" % "1.0.4-c82ab4",
  "org.scalablytyped" %%% "lumino__signaling" % "1.3.5-97c4b4",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.6.1-57e815",
  "org.scalablytyped" %%% "lumino__widgets" % "1.11.1-eab737",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-ece683",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200320Z-629467",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tern" % "0.23-dt-20191126Z-3b4222",
  "org.scalablytyped" %%% "typestyle" % "2.0.4-e2d45d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
