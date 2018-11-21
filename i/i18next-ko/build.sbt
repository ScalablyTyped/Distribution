organization := "com.scalablytyped"
name := "i18next-ko"
version := "3.0-dt-20181018Z-adc426"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "i18next" % "11.9-dt-20181018Z-77029b",
  "com.scalablytyped" %%% "knockout" % "v3.4.0-dt-20181120Z-9cc3d8",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        