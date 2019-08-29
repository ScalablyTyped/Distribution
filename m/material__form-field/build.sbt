organization := "org.scalablytyped"
name := "material__form-field"
version := "0.35-dt-20190313Z-4068a3"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-18f0b9",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-2252a0",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-7519d2",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        