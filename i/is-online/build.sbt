organization := "org.scalablytyped"
name := "is-online"
version := "8.1.0-427a48"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aggregate-error" % "1.0-dt-20180214Z-27f615",
  "org.scalablytyped" %%% "got" % "9.4-dt-20190220Z-7e6142",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "p-any" % "1.1-dt-20180214Z-0a28e2",
  "org.scalablytyped" %%% "p-timeout" % "1.2-dt-20180610Z-e7056f",
  "org.scalablytyped" %%% "public-ip" % "2.4-dt-20181212Z-fcde8e",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-0cc572")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        