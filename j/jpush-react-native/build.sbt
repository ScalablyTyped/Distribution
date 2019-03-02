organization := "org.scalablytyped"
name := "jpush-react-native"
version := "2.5.2-3083a8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20190221Z-8705ae",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-6bffa3",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-b40c6d",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-2a0c96",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-9f13fc",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-6f22df",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-5fff10",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-11e179",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-7a0fba",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-03fd03",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-1f4270",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-54ea62",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-773426",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-a5b4e8",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-45704c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        