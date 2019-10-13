organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20190313Z-5a5e3f"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-a038be",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-2438fa",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-63266b",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-8457e9",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-f17fc6",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        