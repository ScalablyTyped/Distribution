organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-9e64d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-6e05c0",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-7d0448",
  "org.scalablytyped" %%% "inversify" % "5.0.1-74249b",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190319Z-01bfaf",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-89f3ff",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        