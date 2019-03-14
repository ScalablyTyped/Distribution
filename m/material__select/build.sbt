organization := "org.scalablytyped"
name := "material__select"
version := "0.35-dt-20190313Z-40ec12"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-984480",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-17cf3d",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-d1dd77",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        