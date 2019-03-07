organization := "org.scalablytyped"
name := "http-aws-es"
version := "6.0-dt-20190131Z-4c82ad"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.416.0-007a22",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-c05865",
  "org.scalablytyped" %%% "buffer" % "5.2.1-a30395",
  "org.scalablytyped" %%% "elasticsearch" % "5.0-dt-20190212Z-773139",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-585ca8",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-eb5e01",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-46c2c8",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-427e85",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-201946")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        