organization := "org.scalablytyped"
name := "jest-json-schema"
version := "1.2-dt-20180214Z-a63b87"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-f4974a",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-dc1557",
  "org.scalablytyped" %%% "jest" % "23.3-dt-20181126Z-7ca3dc",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-5fd723",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-68b43e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        