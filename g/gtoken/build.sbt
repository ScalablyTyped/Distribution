organization := "org.scalablytyped"
name := "gtoken"
version := "2.3.0-2542ea"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-ae3618",
  "org.scalablytyped" %%% "google-p12-pem" % "1.0.3-afaf27",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-63238d",
  "org.scalablytyped" %%% "jws" % "3.1-dt-20180817Z-94152a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-6294fd",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "node-forge" % "0.7.6-dt-20181204Z-0ff4aa",
  "org.scalablytyped" %%% "pify" % "3.0.0-dt-20180501Z-bdff6a",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        