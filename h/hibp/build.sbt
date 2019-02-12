organization := "org.scalablytyped"
name := "hibp"
version := "7.5.0-080ef9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-7d0f5c",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-134e00",
  "org.scalablytyped" %%% "jssha" % "2.0-dt-20181217Z-f4cc1f",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        