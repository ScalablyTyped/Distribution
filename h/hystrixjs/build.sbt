organization := "org.scalablytyped"
name := "hystrixjs"
version := "0.2-dt-20180214Z-f522d0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "rx" % "4.1-dt-20190322Z-123828",
  "org.scalablytyped" %%% "rx-core" % "4.0-dt-20190322Z-d2f95e",
  "org.scalablytyped" %%% "rx-core-binding" % "4.0-dt-20190322Z-e4a896",
  "org.scalablytyped" %%% "rx-lite" % "4.0-dt-20190322Z-ed58e1",
  "org.scalablytyped" %%% "rx-lite-aggregates" % "4.0-dt-20190322Z-8dfd6d",
  "org.scalablytyped" %%% "rx-lite-async" % "4.0-dt-20181116Z-95167b",
  "org.scalablytyped" %%% "rx-lite-backpressure" % "4.0-dt-20180214Z-2fab97",
  "org.scalablytyped" %%% "rx-lite-coincidence" % "4.0-dt-20190322Z-0a4892",
  "org.scalablytyped" %%% "rx-lite-experimental" % "4.0-dt-20180214Z-0c6a53",
  "org.scalablytyped" %%% "rx-lite-joinpatterns" % "4.0-dt-20180214Z-b35872",
  "org.scalablytyped" %%% "rx-lite-testing" % "4.0-dt-20180214Z-e3370a",
  "org.scalablytyped" %%% "rx-lite-time" % "4.0-dt-20190322Z-6e6b7b",
  "org.scalablytyped" %%% "rx-lite-virtualtime" % "4.0-dt-20190322Z-6ec183",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        