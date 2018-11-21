organization := "com.scalablytyped"
name := "material__textfield"
version := "0.35-dt-20180910Z-1a198f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "material__base" % "0.35-dt-20180910Z-ce1a76",
  "com.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180910Z-d392db",
  "com.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180910Z-99105e",
  "com.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180910Z-ec9f2c",
  "com.scalablytyped" %%% "material__ripple" % "0.35-dt-20180910Z-974ad6",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        