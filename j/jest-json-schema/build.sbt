organization := "org.scalablytyped"
name := "jest-json-schema"
version := "1.2-dt-20180910Z-5b5834"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.1-c0d3c4",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-3455dd",
  "org.scalablytyped" %%% "jest" % "23.3-dt-20181128Z-3671f8",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181208Z-d2b330",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-324fb4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        