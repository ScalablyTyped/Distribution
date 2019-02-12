organization := "org.scalablytyped"
name := "inquirer"
version := "0.0-unknown-dt-20180808Z-006717"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-df5b71",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-604f43",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-7bea92",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-e126f2",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-9d3a33",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-712703",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-dc77ef",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-a2afba",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-f49bdb",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-810f55",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-71b5f3",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-b8b22f",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-c96529",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-684e63")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        