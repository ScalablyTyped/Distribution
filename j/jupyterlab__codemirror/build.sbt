organization := "org.scalablytyped"
name := "jupyterlab__codemirror"
version := "0.19.1-4a9328"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "codemirror" % "0.0-unknown-dt-20190701Z-ca8691",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-f5e4db",
  "org.scalablytyped" %%% "jupyterlab__coreutils" % "2.2.1-1ec723",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-165e39",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-801f09",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-eaf19f",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.2-e890df",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tern" % "0.23-dt-20190516Z-90f514")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        