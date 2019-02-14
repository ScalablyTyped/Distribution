organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-cff4be"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-b9baee",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-9eb054",
  "org.scalablytyped" %%% "inversify" % "5.0.1-4f9552",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190212Z-0d969a",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20190212Z-26f38e",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-b6b428",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        