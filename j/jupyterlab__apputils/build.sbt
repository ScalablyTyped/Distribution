organization := "org.scalablytyped"
name := "jupyterlab__apputils"
version := "1.1.3-8c65cc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-1967d7",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.1.0-c62250",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.3.0-f095c5",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.1.1-a188ca",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-01d0da",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.1-f2c38b",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-f8973d",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.0-fd3cef",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-0dd97f",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.0-6fc554",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-ddfa64",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.2-1caab7",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-e54803",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191003Z-3b437f",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        