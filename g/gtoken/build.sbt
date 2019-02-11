organization := "org.scalablytyped"
name := "gtoken"
version := "2.3.2-53f30d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-a9baf4",
  "org.scalablytyped" %%% "gaxios" % "1.5.1-a2e27f",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-9c3919",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-9587b8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-aa13bf",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-964f6a",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-432a44",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        