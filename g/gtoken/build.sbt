organization := "org.scalablytyped"
name := "gtoken"
version := "2.3.2-47a0fd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "abort-controller" % "2.0.2-85087a",
  "org.scalablytyped" %%% "event-target-shim" % "5.0.1-f65764",
  "org.scalablytyped" %%% "extend" % "3.0-dt-20190212Z-11c3fe",
  "org.scalablytyped" %%% "gaxios" % "1.8.0-295140",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-fb0f7e",
  "org.scalablytyped" %%% "jws" % "3.2-dt-20190131Z-de8173",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-0943d0",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20190130Z-78af58",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-9a0452",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        