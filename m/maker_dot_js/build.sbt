organization := "org.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20181121Z-c257e7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bezier-js" % "0.0-unknown-dt-20181008Z-a7be6e",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "opentype_dot_js" % "0.7-dt-20190212Z-2c01ba",
  "org.scalablytyped" %%% "pdfkit" % "v0.7.2-dt-20180214Z-b026c2",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        