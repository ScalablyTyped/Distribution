organization := "org.scalablytyped"
name := "gtoken"
version := "2.3.2-7166f2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20180214Z-949fff",
  "org.scalablytyped" %%% "gaxios" % "1.2.6-f68ec6",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-3a832f",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-d05a30",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-351386",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-cf4660",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-3c15f1",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        