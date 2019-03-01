organization := "org.scalablytyped"
name := "gtoken"
version := "2.3.2-55e4e0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-9b5c01",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-1e70dd",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-e0af3f",
  "org.scalablytyped" %%% "gaxios" % "1.8.0-d761db",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-9af1b4",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-69308d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-1e1851",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-7168b2",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-3fda20",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        