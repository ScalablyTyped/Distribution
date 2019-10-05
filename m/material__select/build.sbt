organization := "org.scalablytyped"
name := "material__select"
version := "0.35-dt-20190313Z-cadeb2"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-924dab",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-1d2d63",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-b02251",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        