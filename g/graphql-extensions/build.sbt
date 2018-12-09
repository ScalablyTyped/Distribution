organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.3.3-803ef0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-env" % "0.2.5-c98495",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-ced963",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.2.9-910515",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-41c841",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-505dae",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-a76757",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180910Z-63d03b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        