organization := "org.scalablytyped"
name := "hibp"
version := "7.5.1-d256a3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "axios" % "0.18.0-6ed3df",
  "org.scalablytyped" %%% "is-buffer" % "2.0-dt-20181210Z-96cd28",
  "org.scalablytyped" %%% "jssha" % "2.0-dt-20181217Z-f7dda9",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        