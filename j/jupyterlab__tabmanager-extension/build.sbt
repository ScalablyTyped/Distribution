organization := "org.scalablytyped"
name := "jupyterlab__tabmanager-extension"
version := "0.19.1-658e32"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.4-a0e5c1",
  "org.scalablytyped" %%% "jupyterlab__application" % "0.19.1-51da7a",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "0.19.1-863790",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-eb528f",
  "org.scalablytyped" %%% "jupyterlab__docregistry" % "0.19.1-c7d9ed",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.1.1-f0dbe0",
  "org.scalablytyped" %%% "jupyterlab__rendermime" % "0.19.1-e5d18b",
  "org.scalablytyped" %%% "jupyterlab__rendermime-interfaces" % "1.2.1-640bd3",
  "org.scalablytyped" %%% "jupyterlab__services" % "3.2.1-3ddddb",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-3a5136",
  "org.scalablytyped" %%% "phosphor__application" % "1.6.0-ce1fc3",
  "org.scalablytyped" %%% "phosphor__commands" % "1.6.1-0b9e69",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-107474",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-df44ce",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.2-f969aa",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-e93992",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.1.2-ba0842",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.6.0-ee1dda",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-b94c72",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1cea03",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        