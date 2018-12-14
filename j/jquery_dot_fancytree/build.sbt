organization := "org.scalablytyped"
name := "jquery_dot_fancytree"
version := "2.28.2-0-dt-20181206Z-f62c5c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20181214Z-7b71e9",
  "org.scalablytyped" %%% "jqueryui" % "1.12-dt-20181120Z-3e8f44",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181008Z-e65330",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        