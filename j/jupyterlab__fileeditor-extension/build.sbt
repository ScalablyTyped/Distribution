organization := "org.scalablytyped"
name := "jupyterlab__fileeditor-extension"
version := "1.2.2-401f16"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "jupyterlab__application" % "1.2.1-f709d7",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.2.1-41da8a",
  "org.scalablytyped" %%% "jupyterlab__attachments" % "1.2.1-cdd570",
  "org.scalablytyped" %%% "jupyterlab__cells" % "1.2.2-245e05",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "1.2.0-25b97f",
  "org.scalablytyped" %%% "jupyterlab__console" % "1.2.2-fb1717",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.2.0-e7a73f",
  "org.scalablytyped" %%% "jupyterlab__docmanager" % "1.2.1-b21fd4",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "1.2.1-c29858",
  "org.scalablytyped" %%% "jupyterlab__filebrowser" % "1.2.1-57c500",
  "org.scalablytyped" %%% "jupyterlab__fileeditor" % "1.2.1-6aec0b",
  "org.scalablytyped" %%% "jupyterlab__launcher" % "1.2.1-8a36aa",
  "org.scalablytyped" %%% "jupyterlab__mainmenu" % "1.2.1-3d6396",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.4.0-57570a",
  "org.scalablytyped" %%% "jupyterlab__outputarea" % "1.2.2-15e8ad",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "1.2.1-d0f997",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.5.0-be49b7",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.2.0-852fa2",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "1.2.1-6dfd5b",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-cad8ac",
  "org.scalablytyped" %%% "phosphor__application" % "1.7.3-8f1d21",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.2-86b809",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-18e14c",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-0ffa92",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-815e08",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-9147b0",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-075c8c",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.3-ca1d2a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191126Z-3d1d47",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "typestyle" % "2.0.4-e6dde4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        