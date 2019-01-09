organization := "org.scalablytyped"
name := "gtoken"
version := "2.3.0-91312b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-9b2726",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-a3da61",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-929c85",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-e7c000",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b17d95",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-43b9a8",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-f06327",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        