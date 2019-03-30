organization := "org.scalablytyped"
name := "material__drawer"
version := "0.43-dt-20190213Z-5c89ef"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-109fda",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190313Z-0fd505",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-5c1269",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        