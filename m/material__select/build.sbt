organization := "org.scalablytyped"
name := "material__select"
version := "0.35-dt-20180511Z-b2e1da"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-120b37",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180511Z-24504d",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180511Z-700f0d",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        