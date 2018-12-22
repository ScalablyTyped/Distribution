organization := "org.scalablytyped"
name := "http-aws-es"
version := "1.1-dt-20180214Z-544a1f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.382.0-8bf103",
  "org.scalablytyped" %%% "elasticsearch" % "5.0-dt-20181127Z-b87d1c",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180226Z-c0ad51",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-00fa04",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-a778ce",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-6a551f",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-992678")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        