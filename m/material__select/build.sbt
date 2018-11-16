organization := "com.scalablytyped"
name := "material__select"
version := "0.35-dt-20181102Z-d432f1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "material__base" % "0.35-dt-20181102Z-479e75",
  "com.scalablytyped" %%% "material__floating-label" % "0.35-dt-20181102Z-164df8",
  "com.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20181102Z-1da475",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        