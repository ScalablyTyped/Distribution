organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20190313Z-f17377"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-18f0b9",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-fa9daf",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-51bf14",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20190213Z-ff43f0",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-2252a0",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        