organization := "org.scalablytyped"
name := "gtoken"
version := "2.3.0-30ffb2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-51eacb",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-745313",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-767513",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-ed9220",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b650df",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-500a41",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-a2ed03",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        