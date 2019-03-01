organization := "org.scalablytyped"
name := "http-aws-es"
version := "6.0-dt-20190131Z-066d99"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.413.0-3b6039",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-bfbf8a",
  "org.scalablytyped" %%% "buffer" % "5.2.1-732334",
  "org.scalablytyped" %%% "elasticsearch" % "5.0-dt-20190212Z-29ecc2",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-a9efa9",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-deeabc",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-bad7f4",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-ca1b2b",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-f54fa8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        