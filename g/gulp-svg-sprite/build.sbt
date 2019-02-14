organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20181017Z-5b7ccf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190212Z-ca81e9",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-ecf102",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-640fda",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190212Z-0d969a",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-d1795e",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-1749d2",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-f257d2",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-2f7239",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20181017Z-c29c53",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-becbe4",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-853bee",
  "org.scalablytyped" %%% "winston" % "3.2.1-30917f",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-b10f0f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        