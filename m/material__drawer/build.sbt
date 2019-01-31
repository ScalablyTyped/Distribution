organization := "org.scalablytyped"
name := "material__drawer"
version := "0.43-dt-20190119Z-28d617"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-74edb2",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190119Z-0cfb3c",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190119Z-3ceb64",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        