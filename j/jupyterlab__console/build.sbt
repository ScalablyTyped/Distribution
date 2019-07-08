organization := "org.scalablytyped"
name := "jupyterlab__console"
version := "0.19.1-1605f6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "0.19.1-5ac5f9",
  "org.scalablytyped" %%% "jupyterlab__attachments" % "0.19.1-c2ddbf",
  "org.scalablytyped" %%% "jupyterlab__cells" % "0.19.1-22a8b1",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-1ec723",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.1.1-6abc43",
  "org.scalablytyped" %%% "jupyterlab__outputarea" % "0.19.2-599fa6",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "0.19.1-bcf33c",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.2.1-75ef8b",
  "org.scalablytyped" %%% "jupyterlab__services" % "3.2.1-643a6a",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-165e39",
  "org.scalablytyped" %%% "phosphor__commands" % "1.6.1-e23c52",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-801f09",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-eaf19f",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.2-f0e1c7",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-e890df",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.1.2-e146b8",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.6.0-9dde87",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        