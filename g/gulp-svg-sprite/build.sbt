organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20181017Z-5a2a17"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-85e9e1",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-da6376",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-4e8c11",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-34fdd0",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-935d9f",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-0a9f78",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-c8ed4c",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20181017Z-170ff6",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-bcda47",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-7c3560",
  "org.scalablytyped" %%% "winston" % "3.2.1-0522bb",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-ee24cd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        