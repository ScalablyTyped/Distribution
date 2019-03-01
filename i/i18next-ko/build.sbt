organization := "org.scalablytyped"
name := "i18next-ko"
version := "3.0-dt-20181017Z-dc0f7a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "i18next" % "12.1-dt-20181126Z-709d4d",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190218Z-442480",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        