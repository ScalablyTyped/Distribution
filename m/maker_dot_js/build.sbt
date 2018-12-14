organization := "org.scalablytyped"
name := "maker_dot_js"
version := "0.9.33-dt-20181121Z-4f0eb4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bezier-js" % "0.0-unknown-dt-20181009Z-09288b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "opentype_dot_js" % "0.7-dt-20180910Z-ca1102",
  "org.scalablytyped" %%% "pdfkit" % "v0.7.2-dt-20180910Z-5143f5",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        