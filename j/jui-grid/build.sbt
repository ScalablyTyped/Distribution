organization := "org.scalablytyped"
name := "jui-grid"
version := "2.0-dt-20180910Z-3a50ff"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181206Z-03d301",
  "org.scalablytyped" %%% "jui-core" % "2.0-dt-20180910Z-778eda",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-3181aa",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        