organization := "org.scalablytyped"
name := "material__drawer"
version := "0.43-dt-20190213Z-738923"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20190313Z-984480",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190313Z-9cced9",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190313Z-0f1c49",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        