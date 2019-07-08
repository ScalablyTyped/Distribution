organization := "org.scalablytyped"
name := "material__select"
version := "0.35-dt-20190313Z-83ef83"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-ce1ede",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-86b4a9",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-e3e2a1",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        