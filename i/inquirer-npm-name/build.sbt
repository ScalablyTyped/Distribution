organization := "org.scalablytyped"
name := "inquirer-npm-name"
version := "3.0-dt-20181103Z-c21627"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-ab0492",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-e5844c",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-5e603c",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-6f9804",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-65ad54",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-528df6",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-4bdd36",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-1e9fd9",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-c09f2d",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-9ffc9b",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-6ee1a7",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-9ed148",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-dc72ce",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-28a9e6",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-71b24c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        