organization := "org.scalablytyped"
name := "jquery-validation-unobtrusive"
version := "v3.2.3-dt-20180214Z-82b318"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181219Z-1d3df4",
  "org.scalablytyped" %%% "jquery_dot_validation" % "1.16-dt-20180926Z-2902f7",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-f7ab30",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        