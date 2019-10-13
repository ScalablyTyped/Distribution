organization := "org.scalablytyped"
name := "material__form-field"
version := "0.35-dt-20190313Z-ab4c3e"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-a038be",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-f17fc6",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-0b1b8a",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        