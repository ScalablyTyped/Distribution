organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20180511Z-2ec8bc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-6c5aff",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180511Z-da87de",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180511Z-977739",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180511Z-255a34",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-616fba",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        