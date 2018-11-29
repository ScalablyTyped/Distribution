organization := "com.scalablytyped"
name := "jest-json-schema"
version := "1.2-dt-20180910Z-995def"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ajv" % "6.6.1-b44699",
  "com.scalablytyped" %%% "fast-deep-equal" % "2.0.1-892599",
  "com.scalablytyped" %%% "jest" % "23.3-dt-20181128Z-4da3eb",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "uri-js" % "4.2.2-56439b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        