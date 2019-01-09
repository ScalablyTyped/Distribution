organization := "org.scalablytyped"
name := "jest-json-schema"
version := "1.2-dt-20180214Z-86ef6a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.6.2-80a59c",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-fda359",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-d227f7",
  "org.scalablytyped" %%% "jest" % "23.3-dt-20190106Z-8a6ccc",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-7a79c0",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-6a758d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        