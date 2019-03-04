organization := "org.scalablytyped"
name := "jpush-react-native"
version := "2.5.2-37701f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20190221Z-6579ca",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-fcf653",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-0ff5f4",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-073684",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-c6a1ff",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-d750b1",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-4bc33d",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-155534",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-a185ef",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-3fdeaa",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-11fa32",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-ffacfd",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-31722d",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-ec8b23",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-475d9c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        