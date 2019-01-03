organization := "org.scalablytyped"
name := "i18next-ko"
version := "3.0-dt-20181017Z-196532"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "i18next" % "12.1-dt-20181126Z-dcabb3",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190102Z-014288",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        