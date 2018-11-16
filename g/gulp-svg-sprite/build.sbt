organization := "com.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20181102Z-19b6c1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "async" % "2.0.1-dt-20181102Z-7ddc02",
  "com.scalablytyped" %%% "is-stream" % "1.1-dt-20181102Z-13af04",
  "com.scalablytyped" %%% "logform" % "1.2-dt-20181102Z-26421a",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20181102Z-ffe6d2",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20181102Z-c27307",
  "com.scalablytyped" %%% "triple-beam" % "1.3-dt-20181102Z-ce1d40",
  "com.scalablytyped" %%% "vinyl" % "2.0-dt-20181102Z-9ddac1",
  "com.scalablytyped" %%% "winston" % "3.1.0-d04355",
  "com.scalablytyped" %%% "winston-transport" % "4.2.0-77e5cb",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        