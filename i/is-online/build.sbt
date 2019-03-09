organization := "org.scalablytyped"
name := "is-online"
version := "8.1.0-484fc0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aggregate-error" % "1.0-dt-20180214Z-9f0008",
  "org.scalablytyped" %%% "got" % "9.4-dt-20190220Z-2f406b",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "p-any" % "1.1-dt-20180214Z-6976d8",
  "org.scalablytyped" %%% "p-timeout" % "1.2-dt-20180610Z-519d7d",
  "org.scalablytyped" %%% "public-ip" % "2.4-dt-20181212Z-5c7fd7",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-3a715e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        