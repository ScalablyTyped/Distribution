organization := "org.scalablytyped"
name := "graphql-extensions"
version := "0.5.4-84c0fe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-env" % "0.3.4-40a488",
  "org.scalablytyped" %%% "apollo-server-env" % "2.2.0-c5553d",
  "org.scalablytyped" %%% "apollographql__apollo-tools" % "0.3.4-4cf853",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-e810cb",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-a00511",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-95f41a",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "util_dot_promisify" % "1.0-dt-20180214Z-121af0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        