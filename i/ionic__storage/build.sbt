organization := "org.scalablytyped"
name := "ionic__storage"
version := "2.2.0-37f316"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "angular__core" % "8.2.14-660920",
  "org.scalablytyped" %%% "localforage" % "1.7.3-99ffce",
  "org.scalablytyped" %%% "rxjs" % "6.5.3-08a2c3",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        