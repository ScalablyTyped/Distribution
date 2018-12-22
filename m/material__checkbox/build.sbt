organization := "org.scalablytyped"
name := "material__checkbox"
version := "0.35-dt-20180511Z-788e48"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-72d3ab",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-b19b65",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180511Z-35b0e9",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        