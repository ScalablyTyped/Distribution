organization := "org.scalablytyped"
name := "inquirer-npm-name"
version := "3.0-dt-20181103Z-0583c7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "inquirer" % "0.0-unknown-dt-20180808Z-d00958",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20180214Z-8e2ba2",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20180214Z-dd641d",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20180214Z-c800a8",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20181017Z-5dc046",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20180214Z-2daeb9",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-74213f",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-048ab1",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20180214Z-d5be3d",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-b2cd51",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-01c4ae",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-ce7493",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20180214Z-658d5c",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20180214Z-14b60c",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "through" % "0.0-unknown-dt-20180214Z-298b4c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        