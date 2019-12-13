organization := "org.scalablytyped"
name := "jupyterlab__running"
version := "1.2.1-853a0a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.2.1-8427d2",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.2.0-e7a73f",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.4.0-57570a",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.2.0-852fa2",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-cad8ac",
  "org.scalablytyped" %%% "phosphor__commands" % "1.7.2-86b809",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-18e14c",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-0ffa92",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.3.0-815e08",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-9147b0",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.2.0-075c8c",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.9.3-6381db",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191209Z-f85fa6",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        