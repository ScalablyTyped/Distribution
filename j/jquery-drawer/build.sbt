organization := "org.scalablytyped"
name := "jquery-drawer"
version := "3.2-dt-20180409Z-8deae2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "iscroll" % "5.2-dt-20190322Z-d2d6b7",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-6565a2",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-cab61f",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        