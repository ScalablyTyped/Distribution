organization := "org.scalablytyped"
name := "http-rx"
version := "1.1-dt-20180621Z-b2fd92"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20180214Z-e33499",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-bda47a",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "request" % "2.48-dt-20181105Z-2246af",
  "org.scalablytyped" %%% "rxjs" % "6.3.3-d24498",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181015Z-a6a64a",
  "org.scalablytyped" %%% "tslib" % "1.9.3-417c1f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        