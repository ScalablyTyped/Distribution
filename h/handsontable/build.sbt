organization := "com.scalablytyped"
name := "handsontable"
version := "6.2.0-a2e30b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bignumber_dot_js" % "8.0.1-2bc2ef",
  "com.scalablytyped" %%% "moment" % "2.22.2-cce931",
  "com.scalablytyped" %%% "numbro" % "2.1.1-fbbebc",
  "com.scalablytyped" %%% "pikaday" % "1.7-dt-20181120Z-245b0c",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        