organization := "org.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20180511Z-3a7f5e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-74edb2",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180511Z-d02ce3",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180511Z-99f903",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180511Z-8bdbd0",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-a7b33a",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        