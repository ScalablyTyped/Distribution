organization := "org.scalablytyped"
name := "inquirer-npm-name"
version := "3.0-dt-20181103Z-04368a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20190221Z-23f3fa",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-afef54",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-d2f95e",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-2a1bd5",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-ecbab5",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-794432",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-e79331",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-44ae75",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-32f9e9",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-74c9e9",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-5dae72",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-ef0eac",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-bd0f41",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-0ec9a6",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-fc7312")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        