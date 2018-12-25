organization := "org.scalablytyped"
name := "http-link-dataloader"
version := "0.1.6-55c6f9"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-d4b20d",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-52c89b",
  "org.scalablytyped" %%% "cross-fetch" % "3.0.0-c28eb4",
  "org.scalablytyped" %%% "dataloader" % "1.4.0-565b78",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-904c02",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181016Z-3245d4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-d6edb6",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-76c70f",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-850d40")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        