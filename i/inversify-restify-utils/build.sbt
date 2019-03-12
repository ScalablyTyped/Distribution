organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-57ff13"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20190311Z-ee010e",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-bad2ee",
  "org.scalablytyped" %%% "inversify" % "5.0.1-74249b",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190212Z-f2d047",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-74edcc",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        