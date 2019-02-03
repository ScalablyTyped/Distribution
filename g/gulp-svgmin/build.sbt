organization := "org.scalablytyped"
name := "gulp-svgmin"
version := "1.2-dt-20180508Z-fd70e7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "svgo" % "1.0-dt-20180507Z-92bf78",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-6ef4cf")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        