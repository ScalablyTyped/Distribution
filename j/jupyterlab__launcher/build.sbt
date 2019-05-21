organization := "org.scalablytyped"
name := "jupyterlab__launcher"
version := "0.19.1-ba2bcb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "0.19.1-782928",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-3233d1",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.1.1-b90faa",
  "org.scalablytyped" %%% "jupyterlab__services" % "3.2.1-bd4353",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-bf1ab8",
  "org.scalablytyped" %%% "phosphor__commands" % "1.6.1-e316ce",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-e670f1",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-662fe3",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.2-56ae61",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-ada9c2",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.1.2-d794d9",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.6.0-76fa1c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-ff94fb",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190508Z-56dde3",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        