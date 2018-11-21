organization := "com.scalablytyped"
name := "http-link-dataloader"
version := "0.1.5-845932"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-link" % "1.2.3-ed789a",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.21-6af781",
  "com.scalablytyped" %%% "dataloader" % "1.4.0-3d2875",
  "com.scalablytyped" %%% "fclone" % "1.0.11-4304d4",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-4871a9",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-2ae465",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.10-36203d",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        