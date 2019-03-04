organization := "org.scalablytyped"
name := "http-link-dataloader"
version := "0.1.6-569d44"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.8-98b0c6",
  "org.scalablytyped" %%% "cross-fetch" % "3.0.1-8e1c6d",
  "org.scalablytyped" %%% "dataloader" % "1.4.0-01603e",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-a00511",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-0943d0",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-fb19a7",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.15-ca96a2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        