organization := "org.scalablytyped"
name := "hibp"
version := "7.5.0-17118e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-68668a",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-30c135",
  "org.scalablytyped" %%% "jssha" % "2.0-dt-20181217Z-f4cc1f",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        