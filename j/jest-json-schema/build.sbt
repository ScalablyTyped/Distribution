organization := "com.scalablytyped"
name := "jest-json-schema"
version := "1.2-dt-20181102Z-7b89ec"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ajv" % "6.5.4-db8cdc",
  "com.scalablytyped" %%% "fast-deep-equal" % "2.0.1-dcdec4",
  "com.scalablytyped" %%% "jest" % "23.3-dt-20181102Z-2494ad",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "uri-js" % "4.2.2-e7a1dc",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        