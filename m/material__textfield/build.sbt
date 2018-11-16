organization := "com.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20181102Z-a453d3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "material__base" % "0.35-dt-20181102Z-479e75",
  "com.scalablytyped" %%% "material__floating-label" % "0.35-dt-20181102Z-164df8",
  "com.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20181102Z-1da475",
  "com.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20181102Z-8b206c",
  "com.scalablytyped" %%% "material__ripple" % "0.35-dt-20181102Z-4659ee",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        