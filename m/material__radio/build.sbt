organization := "com.scalablytyped"
name := "material__radio"
version := "0.35-dt-20180910Z-a38a7d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "material__base" % "0.35-dt-20180910Z-2613c9",
  "com.scalablytyped" %%% "material__ripple" % "0.35-dt-20180910Z-4b74ab",
  "com.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180910Z-1a96c0",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        