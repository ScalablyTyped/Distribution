organization := "org.scalablytyped"
name := "material__select"
version := "0.35-dt-20190313Z-ce1d1b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-01ea4d",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-f96b68",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-5acf58",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        