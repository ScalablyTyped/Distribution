organization := "org.scalablytyped"
name := "material__form-field"
version := "0.35-dt-20180910Z-3c8ff8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180910Z-e6bab8",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180910Z-ed446a",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180910Z-c76885",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        