organization := "org.scalablytyped"
name := "jupyterlab__outputarea"
version := "1.1.3-b578e6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.1.3-93f9ce",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.1.0-9e98ec",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.3.0-d904b1",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "1.1.3-6583e6",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.4.0-2d1a5d",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.1.1-781d39",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-16d154",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.1-bc471d",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-78483d",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.0-81139e",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-c20c6a",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.0-c3f7c0",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-2353cf",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.2-496c0b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191014Z-d5b0ca",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        