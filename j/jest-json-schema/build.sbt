organization := "com.scalablytyped"
name := "jest-json-schema"
version := "1.2-dt-20180910Z-a424b4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "ajv" % "6.5.4-9e8709",
  "com.scalablytyped" %%% "fast-deep-equal" % "2.0.1-ef0253",
  "com.scalablytyped" %%% "jest" % "23.3-dt-20181031Z-ba28d5",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "uri-js" % "4.2.2-32727b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        