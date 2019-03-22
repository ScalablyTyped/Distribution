organization := "org.scalablytyped"
name := "is-online"
version := "8.1.0-e50cf0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aggregate-error" % "2.2.0-6457eb",
  "org.scalablytyped" %%% "clean-stack" % "1.3-dt-20180214Z-b857a2",
  "org.scalablytyped" %%% "got" % "9.4-dt-20190312Z-c99bf9",
  "org.scalablytyped" %%% "indent-string" % "3.2-dt-20181210Z-52f01b",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "p-any" % "2.0.0-bcbb68",
  "org.scalablytyped" %%% "p-cancelable" % "1.1.0-b27b20",
  "org.scalablytyped" %%% "p-some" % "4.0.0-81ba44",
  "org.scalablytyped" %%% "p-timeout" % "3.0.0-f49914",
  "org.scalablytyped" %%% "public-ip" % "2.4-dt-20181212Z-fcde8e",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-0cc572",
  "org.scalablytyped" %%% "type-fest" % "0.1.0-bc775c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        