organization := "com.scalablytyped"
name := "i18next-ko"
version := "3.0-dt-20181018Z-5eaee1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "i18next" % "12.1-dt-20181128Z-534ef7",
  "com.scalablytyped" %%% "knockout" % "v3.4.0-dt-20181120Z-cbbd34",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        