organization := "org.scalablytyped"
name := "material__select"
version := "0.35-dt-20190313Z-284f4a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-109fda",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20190213Z-b934b9",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20190213Z-9e0bf7",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        