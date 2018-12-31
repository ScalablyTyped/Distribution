organization := "org.scalablytyped"
name := "handsontable"
version := "6.2.2-9143a4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bignumber_dot_js" % "8.0.1-5688f8",
  "org.scalablytyped" %%% "moment" % "2.23.0-9a5931",
  "org.scalablytyped" %%% "numbro" % "2.1.1-2619bf",
  "org.scalablytyped" %%% "pikaday" % "1.7-dt-20181116Z-c227da",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        