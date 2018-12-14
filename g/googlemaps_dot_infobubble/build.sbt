organization := "org.scalablytyped"
name := "googlemaps_dot_infobubble"
version := "3.0-dt-20180910Z-28ce3c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "google-maps" % "3.2.1-dt-20180910Z-da5fec",
  "org.scalablytyped" %%% "googlemaps" % "3.30-dt-20181027Z-d0dec4",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        