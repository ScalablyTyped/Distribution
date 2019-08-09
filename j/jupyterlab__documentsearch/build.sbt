organization := "org.scalablytyped"
name := "jupyterlab__documentsearch"
version := "1.0.2-de129e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "codemirror" % "0.0-unknown-dt-20190701Z-0cec7f",
  "org.scalablytyped" %%% "csstype" % "2.6.6-7e82e4",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-35ffb4",
  "org.scalablytyped" %%% "jupyterlab__apputils" % "1.0.2-2e76a0",
  "org.scalablytyped" %%% "jupyterlab__codemirror" % "1.0.2-961b7e",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "3.0.0-27e5f7",
  "org.scalablytyped" %%% "jupyterlab__fileeditor" % "1.0.2-862417",
  "org.scalablytyped" %%% "jupyterlab__observables" % "2.2.0-689d92",
  "org.scalablytyped" %%% "jupyterlab__services" % "4.0.2-80af18",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.3-016a04",
  "org.scalablytyped" %%% "phosphor__commands" % "1.6.3-391b78",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-df57f7",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.2.0-9489b1",
  "org.scalablytyped" %%% "phosphor__messaging" % "1.2.3-27e712",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.3-4cce89",
  "org.scalablytyped" %%% "phosphor__virtualdom" % "1.1.3-e0bcde",
  "org.scalablytyped" %%% "phosphor__widgets" % "1.8.1-3b432d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f48590",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190809Z-2d489e",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "tern" % "0.23-dt-20190516Z-3f8325")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        