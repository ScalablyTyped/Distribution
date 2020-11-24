organization := "org.scalablytyped"
name := "jupyterlab__theme-dark-extension"
version := "2.2.6-785f43"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-fa358f",
  "org.scalablytyped" %%% "free-style" % "3.1.0-ed0207",
  "org.scalablytyped" %%% "jupyterlab__application" % "2.2.6-c45abc",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "2.2.6-0982bf",
  "org.scalablytyped" %%% "jupyterlab__codeeditor" % "2.2.5-632264",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "4.2.5-87338e",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "2.2.4-de0b50",
  "org.scalablytyped" %%% "jupyterlab__nbformat" % "2.2.5-0047cf",
  "org.scalablytyped" %%% "jupyterlab__observables" % "3.2.5-79e6a4",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "2.2.4-b0851a",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "2.2.1-97812d",
  "org.scalablytyped" %%% "jupyterlab__services" % "5.2.5-73571d",
  "org.scalablytyped" %%% "jupyterlab__settingregistry" % "2.2.5-b492e8",
  "org.scalablytyped" %%% "jupyterlab__statedb" % "2.2.5-15089d",
  "org.scalablytyped" %%% "jupyterlab__ui-components" % "2.2.4-04f934",
  "org.scalablytyped" %%% "lumino__algorithm" % "1.3.3-bf4c20",
  "org.scalablytyped" %%% "lumino__application" % "1.11.1-ce9917",
  "org.scalablytyped" %%% "lumino__commands" % "1.11.4-d20736",
  "org.scalablytyped" %%% "lumino__coreutils" % "1.5.3-89d7c4",
  "org.scalablytyped" %%% "lumino__disposable" % "1.4.3-b18675",
  "org.scalablytyped" %%% "lumino__messaging" % "1.4.3-ee7699",
  "org.scalablytyped" %%% "lumino__polling" % "1.3.3-90c4fc",
  "org.scalablytyped" %%% "lumino__signaling" % "1.4.3-6274b9",
  "org.scalablytyped" %%% "lumino__virtualdom" % "1.7.3-2ee69f",
  "org.scalablytyped" %%% "lumino__widgets" % "1.14.1-2956bb",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-0012d8",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-cfb347",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "typestyle" % "2.1.0-e0ab33")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
