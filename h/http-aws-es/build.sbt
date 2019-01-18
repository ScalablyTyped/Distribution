organization := "org.scalablytyped"
name := "http-aws-es"
version := "1.1-dt-20180214Z-23dc0b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.390.0-e9fecb",
  "org.scalablytyped" %%% "elasticsearch" % "5.0-dt-20181127Z-7fdd5f",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180226Z-b3b26c",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-b22fa9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-2af35f",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-f35d60",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-8e79db")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        