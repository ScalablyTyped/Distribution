organization := "org.scalablytyped"
name := "knockout_dot_kogrid"
version := "0.0-unknown-dt-20180214Z-c785a2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20190108Z-f5a31c",
  "org.scalablytyped" %%% "knockout" % "v3.4.0-dt-20190218Z-a6b42e",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-b709fe",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        