organization := "org.scalablytyped"
name := "gtoken"
version := "2.3.2-1e3d3b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-a9baf4",
  "org.scalablytyped" %%% "gaxios" % "1.4.0-65bc0e",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-30ea8c",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-d566eb",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-54d3f4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-9a96a4",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-05dded",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-432a44",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        