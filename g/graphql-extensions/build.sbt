organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.3.3-c92305"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-5045f9",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-22da02",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.8-a8f4a8",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-50a955",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-f94ee7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-dbcdca",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-ee6e48")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        