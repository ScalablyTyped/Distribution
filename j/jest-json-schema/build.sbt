organization := "org.scalablytyped"
name := "jest-json-schema"
version := "1.2-dt-20180214Z-0776ea"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ajv" % "6.8.1-9e8624",
  "org.scalablytyped" %%% "fast-deep-equal" % "2.0.1-57e227",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-ddf996",
  "org.scalablytyped" %%% "jest" % "23.3-dt-20190115Z-12ea0b",
  "org.scalablytyped" %%% "punycode" % "2.1-dt-20181205Z-82f2e3",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "uri-js" % "4.2.2-df3f4a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        