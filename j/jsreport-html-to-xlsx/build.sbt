organization := "com.scalablytyped"
name := "jsreport-html-to-xlsx"
version := "2.0-dt-20181102Z-18e59c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "jsreport-core" % "1.5-dt-20181102Z-ddfafe",
  "com.scalablytyped" %%% "jsreport-xlsx" % "1.4-dt-20181102Z-c66c5d",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        