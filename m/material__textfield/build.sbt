organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20190313Z-f8bbd6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-01ea4d",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-f96b68",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-5acf58",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-aa13b3",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-4a5765",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        