organization := "org.scalablytyped"
name := "http-aws-es"
version := "6.0-dt-20190131Z-34d160"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.395.0-2e2b42",
  "org.scalablytyped" %%% "elasticsearch" % "5.0-dt-20181127Z-aaebcc",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-c467a0",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-501bf7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-316df6",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-7c0b14",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-724be8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        