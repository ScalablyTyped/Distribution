organization := "com.scalablytyped"
name := "material__form-field"
version := "0.35-dt-20180910Z-cbfdb6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "material__base" % "0.35-dt-20180910Z-ce1a76",
  "com.scalablytyped" %%% "material__ripple" % "0.35-dt-20180910Z-974ad6",
  "com.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180910Z-7378e8",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        