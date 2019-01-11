organization := "org.scalablytyped"
name := "inversify-restify-utils"
version := "3.4.0-481dcb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bunyan" % "1.8-dt-20181009Z-f2a2e1",
  "org.scalablytyped" %%% "gulp-debug" % "v2.0.1-dt-20180214Z-8efa54",
  "org.scalablytyped" %%% "inversify" % "5.0.1-6060b1",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "restify" % "7.2-dt-20181231Z-ecd83a",
  "org.scalablytyped" %%% "spdy" % "3.4-dt-20181121Z-ee92df",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        