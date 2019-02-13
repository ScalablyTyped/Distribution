organization := "org.scalablytyped"
name := "gtoken"
version := "2.3.2-2da2fa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-59625b",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.0-188cac",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-a9baf4",
  "org.scalablytyped" %%% "gaxios" % "1.7.0-4b258d",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-30360e",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-7b590d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-5b74a4",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-019ccf",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-432a44",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        