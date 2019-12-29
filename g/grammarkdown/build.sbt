organization := "org.scalablytyped"
name := "grammarkdown"
version := "2.0.12-0b79f5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "esfx__cancelable" % "1.0.0-pre.13-1878c4",
  "org.scalablytyped" %%% "esfx__disposable" % "1.0.0-pre.13-820ccb",
  "org.scalablytyped" %%% "prex" % "0.4.6-b61bd5",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        