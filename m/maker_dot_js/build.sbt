organization := "org.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20181121Z-38082d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bezier-js" % "0.0-unknown-dt-20181008Z-53042c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "opentype_dot_js" % "0.7-dt-20190212Z-818419",
  "org.scalablytyped" %%% "pdfkit" % "v0.7.2-dt-20180214Z-5085d5",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        