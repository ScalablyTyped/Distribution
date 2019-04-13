organization := "org.scalablytyped"
name := "material__radio"
version := "0.35-dt-20190313Z-a4ad7a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-021bff",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20190313Z-b0b70f",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20190213Z-5b75f6",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        