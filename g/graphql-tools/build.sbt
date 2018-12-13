organization := "org.scalablytyped"
name := "graphql-tools"
version := "4.0.3-aaab22"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-835191",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-7c4334",
  "org.scalablytyped" %%% "deprecated-decorator" % "0.1.6-a5e214",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-1de855",
  "org.scalablytyped" %%% "iterall" % "1.2.2-0da489",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-6ad88a",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-6efe62",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-b2ad40")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        