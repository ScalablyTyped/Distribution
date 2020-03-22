organization := "org.scalablytyped"
name := "grammarkdown"
version := "2.0.12-8fd7b0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.13-2cb8f7",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.13-ef51ff",
  "org.scalablytyped" %%% "prex" % "0.4.6-f22824",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
