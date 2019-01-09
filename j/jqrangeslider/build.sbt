organization := "org.scalablytyped"
name := "jqrangeslider"
version := "5.7.2-dt-20180214Z-65b83c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-ec51da",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20181116Z-0d07e5",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-9e9c07",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        