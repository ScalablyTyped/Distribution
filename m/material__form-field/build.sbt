organization := "org.scalablytyped"
name := "material__form-field"
version := "0.35-dt-20190313Z-25a0ce"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-7e7097",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-36d274",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-f7898e",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        