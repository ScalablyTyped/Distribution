organization := "org.scalablytyped"
name := "gulp-svg-sprite"
version := "1.2.9-dt-20181017Z-20951e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "async" % "2.4-dt-20190117Z-89bc8b",
  "org.scalablytyped" %%% "is-stream" % "1.1-dt-20180214Z-1e72c1",
  "org.scalablytyped" %%% "logform" % "1.2-dt-20180214Z-845012",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "one-time" % "0.0-dt-20181231Z-823163",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-78801a",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-ba3926",
  "org.scalablytyped" %%% "stack-trace" % "0.0-unknown-dt-20180214Z-111f11",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "svg-sprite" % "0.0-unknown-dt-20181017Z-3ecda4",
  "org.scalablytyped" %%% "triple-beam" % "1.3-dt-20180828Z-ae8e92",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-4938db",
  "org.scalablytyped" %%% "winston" % "3.2.1-8c0e79",
  "org.scalablytyped" %%% "winston-transport" % "4.3.0-64d15f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        