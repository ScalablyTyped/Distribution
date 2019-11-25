organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20190313Z-ea5b78"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-b8d27a",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-11d9a7",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-fbfefb",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-28b987",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-87bd6a",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        