organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-988178"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-dd7f46",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-287413",
  "org.scalablytyped" %%% "inversify" % "5.0.1-4f9552",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190212Z-c94da1",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-28c4a9",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        