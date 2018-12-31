organization := "org.scalablytyped"
name := "material__radio"
version := "0.35-dt-20180511Z-b3fc1f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-a75cf1",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-357a8a",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180511Z-1b3dba",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        