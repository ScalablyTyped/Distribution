organization := "org.scalablytyped"
name := "gtoken"
version := "2.3.3-aee04f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "3.0.0-3eaeb3",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-4b0f6d",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-ef9ad3",
  "org.scalablytyped" %%% "gaxios" % "1.8.3-ab174c",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.4-6563ed",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-a8e5fd",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190411Z-5a2eed",
  "org.scalablytyped" %%% "node-forge" % "0.8.1-dt-20190326Z-39c0a8",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20190322Z-6f182f",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        