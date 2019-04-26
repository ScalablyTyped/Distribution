organization := "org.scalablytyped"
name := "knockback"
version := "0.0-unknown-dt-20190322Z-d972d5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "backbone" % "1.3.3-dt-20190425Z-0972ff",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-45cee7",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190415Z-78a449",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-dae54d",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190326Z-68d020")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        