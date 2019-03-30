organization := "org.scalablytyped"
name := "http-aws-es"
version := "6.0-dt-20190131Z-8c7911"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.432.0-9a0962",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-a816e1",
  "org.scalablytyped" %%% "buffer" % "5.2.1-519900",
  "org.scalablytyped" %%% "elasticsearch" % "5.0-dt-20190314Z-2be6c0",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-3a85ce",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-00ea77",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20190322Z-da2201",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-6fb7ef",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-fde9b0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        