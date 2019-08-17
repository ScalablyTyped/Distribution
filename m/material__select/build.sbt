organization := "org.scalablytyped"
name := "material__select"
version := "0.35-dt-20190313Z-081031"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-cffd24",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-592cd6",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-b4a83b",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        